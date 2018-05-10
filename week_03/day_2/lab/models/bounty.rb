require('pg')
class Bounty

  attr_accessor :name, :species, :value, :collected_by

  def initialize(bounty)
    @id = bounty['id'].to_i if bounty['id']
    @name = bounty['name']
    @species = bounty['species']
    @value = bounty['value'].to_i
    @collected_by = bounty['collected_by']
  end

  def save()
    db = PG.connect({dbname: 'bounty_hunter', host: 'localhost'})
    sql = "INSERT INTO bounty
    (name, species, value, collected_by)
    VALUES ($1, $2, $3, $4)
    RETURNING *;"
    values = [@name, @species, @value, @collected_by]
    db.prepare("save", sql)
    @id = db.exec_prepared("save", values)[0]["id"].to_i
    db.close()
  end

  def delete()
    db = PG.connect({dbname: 'bounty_hunter', host: 'localhost'})
    sql = "DELETE FROM bounty WHERE id = $1"
    values = [@id]
    db.prepare("delete_one", sql)
    db.exec_prepared("delete_one", values)
    db.close()
  end

  def update()
    db = PG.connect({dbname: 'bounty_hunter', host: 'localhost'})
    sql = "UPDATE bounty SET
    (name, species, value, collected_by)
    = ($1, $2, $3, $4)
    WHERE id = $5"
    values = [@name, @species, @value, @collected_by, @id]
    db.prepare("update", sql)
    db.exec_prepared("update", values)
    db.close()
  end

  def Bounty.find(id)
    db = PG.connect({dbname: 'bounty_hunter', host: 'localhost'})
    sql = "SELECT * FROM bounty WHERE id = $1"
    values = [id]
    db.prepare("find", sql)
    bounty = db.exec_prepared("find", values)[0]
    db.close()
    return Bounty.new(bounty)
  end

end
