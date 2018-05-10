puts "When was Ruby created? "
year = gets.chomp

if (year.to_i == 1995)
  puts "Well done.  That is correct"
elsif ((year.to_i > 1990) || (year.to_i < 2000))
  puts "Close, but no cigar."
else
  puts "Sorry that is not correct."
end
