require("minitest/autorun")
require("minitest/rg")

require_relative("../person.rb")

class PersonTest < MiniTest::Test

  def setup
    @person = Person.new("Graeme", 49)
  end

  def test_person_has_name
    assert_equal("Graeme", @person.name())
  end

  def test_person_has_age
    assert_equal(49, @person.age())
  end
end
