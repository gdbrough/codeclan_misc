require('minitest/autorun')
require('minitest/rg')
require_relative("../modifier.rb")


class TestModifier < MiniTest::Test

  def setup()
    @modifier = Modifier.new(5, 10)
  end

  def test_has_start_position
    assert_equal(5, @modifier.start_pos)
  end

  def test_has_end_position
    assert_equal(10, @modifier.end_pos)
  end



end
