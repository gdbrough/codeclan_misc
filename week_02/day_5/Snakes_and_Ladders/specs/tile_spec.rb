require('minitest/autorun')
require('minitest/rg')
require_relative("../tile.rb")


class TestTile < MiniTest::Test

  def setup()
    @tile = Tile.new(5, 10)
  end

  def test_has_position
    assert_equal(5, @tile.position)
  end






end
