require("minitest/autorun")
require("minitest/rg")

require_relative("../bus.rb")
require_relative("../person.rb")
require_relative("../stop.rb")

class BusTest < MiniTest::Test
  def setup
    @person1 = Person.new("Graeme", 49)
    @person2 = Person.new("Alexander", 79)
    @person3 = Person.new("Evelyn", 35)
    @person4 = Person.new("Dave", 12)
    @person5 = Person.new("Bob", 11)
    @person6 = Person.new("Stuart", 13)

    @bus = Bus.new("38","Stirling", [@person2, @person3])

    @stop = Stop.new("Larbert", [@person1, @person4, @person5, @person6])

  end

  def test_bus_has_route_number
    assert_equal("38", @bus.route_number())
  end

  def test_bus_has_destination
    assert_equal("Stirling", @bus.destination())
  end

  def test_bus_can_drive
    assert_equal("Brum Brum", @bus.drive())
  end

  def test_returns_count_of_passengers
    assert_equal(2, @bus.passengers().count)
  end

  def test_bus_can_pick_up_passengers
    @bus.pick_up(@person1)
    assert_equal(3, @bus.passengers().count)
  end

  def test_bus_can_drop_off_passengers
    @bus.drop_off(@person2)
    assert_equal(1, @bus.passengers().count)
  end

  def test_bus_can_be_emptied
    @bus.empty()
    assert_equal(0, @bus.passengers().count)
  end

  def test_bus_can_pick_up_all_passengers_from_named_stop
    @bus.pick_up_from_stop(@stop)
    assert_equal(6, @bus.passengers().count)
    assert_equal(0, @stop.queue().count)
  end

end
