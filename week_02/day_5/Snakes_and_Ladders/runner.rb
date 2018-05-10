require_relative("./board.rb")
require_relative("./dice.rb")
require_relative("./player.rb")
require_relative("./modifier.rb")
require_relative("./game.rb")


p "Welcome to Snakes and Ladders"

p "Input name of player 1"

name1 = gets.chomp()

p "Input name of player 2"

name2 = gets.chomp()

player1 = Player.new(name1)
player2 = Player.new(name2)
dice = Dice.new()
players = [player1, player2]
tiles = (1..100).to_a()
board = Board.new(tiles)
mod1 = Modifier.new(5, 20)
mod2 = Modifier.new(85, 12)
mod3 = Modifier.new(10, 80)
mod4 = Modifier.new(35, 60)
mod5 = Modifier.new(99, 2)
modArray = [mod1, mod2, mod3, mod4, mod5]
game = Game.new(players, dice, modArray, board)



p "player 1 is #{game.players[0].name}"
p "player 2 is #{game.players[1].name}"

while game.inplay do
p game.players[0].name + " press a key to roll dice...."
gets.chomp
# take turn
current_roll = game.dice.roll_dice()
p game.players[0].name + " rolled a " + current_roll.to_s()
# move player
player_position = game.players[0].position += current_roll
original_position = player_position
p "#{game.players[0].name} moved to position #{player_position}"
# Check modifier
game.players[0].position = game.check_modifier(player_position)
if game.players[0].position > original_position
  p "#{game.players[0].name} landed on a ladder and is now in position #{game.players[0].position}"
end
if game.players[0].position < original_position
  p "#{game.players[0].name} landed on a snake and is now in position #{game.players[0].position}"
end
# check win
game.check_win()
if game.inplay == false
  p game.players[0].name + " wins!!!!"
else
  game.rotate_players()
end
end
p "thanks for playing"
