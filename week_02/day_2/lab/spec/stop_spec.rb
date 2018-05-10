require("minitest/autorun")
require("minitest/rg")

require_relative("../stop.rb")
require_relative("../person.rb")

class StopTest < MiniTest::Test

  def setup
    @stop = Stop.new("Larbert", [])

    @person1 = Person.new("Graeme", 49)
    @person2 = Person.new("Alexander", 79)
    @person3 = Person.new("Evelyn", 35)
  end

  def test_stop_has_name
    assert_equal("Larbert", @stop.name())
  end

  def test_returns_count_of_queueing_passengers
    assert_equal(0, @stop.queue().count)
  end

  def test_add_queueing_passenger
    @stop.add_queueing_passenger(@person1)
    assert_equal(1, @stop.queue().count)
  end

end
