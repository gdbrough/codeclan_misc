chickens = ["Margaret", "Hetty", "Henrietta", "Audrey", "Mabel"]

# for hen in chickens
#   p hen
# end

# chickens.each { | chicken | p chicken}
#
# chickens.each do | chicken |
#   shouting_chicken = chicken.upcase
#   p shouting_chicken
# end

# name_lengths = []
# for chicken in chickens
#   name_lengths << chicken.length()
# end

# name_lengths = chickens.map { |chicken| chicken.length() }
#
# p name_lengths

# chickens.each_with_index{|chicken, index| p "#{chicken} is a index #{index}"}
#
# p chickens.find {|chicken| chicken[0] == "H"} # returns first occurrence only
#
# p chickens.find_all {|chicken| chicken[0] == "H"} # returns all occurrences
# p chickens.select {|chicken| chicken[0] == "H"} # same as find_all

p chickens.reduce{|list, chicken| list + ", " + chicken}

p [1,2,3,4,5].reduce {|sum, number| sum + number}
p [1,2,3,4,5].inject {|sum, number| sum + number} # same as reduce
