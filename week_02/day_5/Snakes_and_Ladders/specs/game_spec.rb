require('minitest/autorun')
require('minitest/rg')
require_relative("../board.rb")
require_relative("../dice.rb")
require_relative("../player.rb")
require_relative("../modifier.rb")
require_relative("../game.rb")


class TestGame < MiniTest::Test

  def setup()
    @dice = Dice.new()
    @player1 = Player.new("Jeff Bridges")
    @player2 = Player.new("Kevin Bridges")
    @players = [@player1, @player2]
    @tiles = (1..100).to_a()
    @board = Board.new(@tiles)
    @mod1 = Modifier.new(5, 20)
    @mod2 = Modifier.new(85, 12)
    @mod3 = Modifier.new(10, 80)
    @mod4 = Modifier.new(35, 60)
    @mod5 = Modifier.new(99, 2)
    @modArray = [@mod1, @mod2, @mod3, @mod4, @mod5]
    @game = Game.new(@players, @dice, @modArray, @board)
  end

  def test_can_check_modifier
    position = 5
    assert_equal(true, @game.check_modifier(position))
  end

  def test_check_win
    @player1.position = 100
    assert_equal(true, @game.check_win())
  end

  def test_check_player_rotate
    @game.rotate_players()
    assert_equal("Kevin Bridges", @game.players[0].name)
  end



end
