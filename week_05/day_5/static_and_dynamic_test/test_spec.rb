require("minitest/autorun")
require("minitest/rg")

require_relative("testing_task_2.rb")

class TestCardGame < Minitest::Test

  def setup()
    @card1 = CardGame.checkforAce(["Spades",3])
    @card2 = CardGame.checkforAce(["Hearts",1])
  end

  def test_check_for_ace()
    assert_equals(false, @card1)
    assert_equals(true, @card2)
  end

end
