
class Dice

  attr_reader :current_number

  def initialize()
    @current_number = 0
  end

  def roll_dice()
    @current_number = rand(1..6)
  end


end
