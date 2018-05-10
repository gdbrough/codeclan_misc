# def get_account_name(account)
#   return account[:holder_name]
# end

class BankAccount
  # attr_reader :type, :amount, :holder_name
  # attr_writer :type, :amount, :holder_name
  attr_accessor :type, :amount, :holder_name #not recommended

  def initialize(input_holder_name, input_amount, input_type)
    @holder_name = input_holder_name
    @amount = input_amount
    @type = input_type
  end

# get and set methods replaced by attr_reader attr_writer or attr_accessor
  # def get_holder_name
  #   return @holder_name
  # end
  #
  # def get_amount
  #   return @amount
  # end
  #
  # def get_type
  #   return @type
  # end

  # def set_holder_name(name)
  #   @holder_name = name
  # end
  #
  # def set_type(type)
  #   @type = type
  # end

  def direct_debit()
    @amount -= 50 if @type == "personal"
    @amount -= 100 if @type == "business"
  end

  def deposit(amount)
    self.amount += amount # self is alternate to @ (e.g @amount)
  end
end
