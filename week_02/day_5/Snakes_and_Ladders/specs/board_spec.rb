require('minitest/autorun')
require('minitest/rg')
require_relative("../board.rb")
require_relative("../tile.rb")


class TestBoard < MiniTest::Test

  def setup()
    @tiles = (1..100).to_a()
    @board = Board.new(@tiles)
  end

  def test_board_has_100_positions
    assert_equal(100, @board.tiles.length)
  end






end
