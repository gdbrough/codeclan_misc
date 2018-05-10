
require('minitest/autorun')
require('minitest/rg')
require_relative("../player.rb")

class TestPlayer < MiniTest::Test

  def setup()
    @player = Player.new("Jeff Bridges")
  end

  def test_player_has_name
    assert_equal("Jeff Bridges", @player.name)
  end

  def test_player_can_move
    @player.move(10)
    @player.move(-5)
    assert_equal(5, @player.position)
  end





end
