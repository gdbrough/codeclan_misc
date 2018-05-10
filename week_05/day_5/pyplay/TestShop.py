import unittest
from Shop import Shop

class TestCakeShop(unittest.TestCase):
    def setUp(self):
        cakes = {
            "name": ["Brownie", "Chocolate Fudge", "Lemon Drizzle"],
            "rating": [8, 9, 8]
        }
        self.shop = Shop("My Cake Shop", cakes)

    def test_shop_has_name(self):
        self.assertEquals("My Cake Shop", self.shop.name)

    def test_shop_has_three_cakes(self):
        self.assertEquals(3, self.shop.number_of_cakes())

    def test_cakes_have_three_ratings(self):
        self.assertEquals(3, len(self.shop.cakes["rating"]))

    def test_sum_of_cakes_ratings(self):
        self.assertEquals(25, self.shop.total_cakes_ratings())

    def test_average_cakes_rating(self):
        self.assertEquals(8.33, self.shop.average_cakes_rating())

unittest.main()
