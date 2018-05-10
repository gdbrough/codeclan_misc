class Shop:
    def __init__(self, name, cakes):
        self.name = name
        self.cakes = cakes

    def number_of_cakes(self):
        return len(self.cakes["name"])

    def total_cakes_ratings(self):
        return sum(self.cakes["rating"])

    def average_cakes_rating(self):
        return round(float(self.total_cakes_ratings()) / float(self.number_of_cakes()), 2)
