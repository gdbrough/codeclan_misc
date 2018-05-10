def get_name(person)
  return person[:name]
end

def get_fav_tv_show(person)
  return person[:favourites][:tv_show]
end

def is_food_liked_by_person(person, food)
  if person[:favourites][:things_to_eat].find_index(food) != nil
    return true
  else
    return false
  end
  # return person[:favourites][:things_to_eat].include?(food)
end

def add_friend(person, new_friend)
  person[:friends].push(new_friend)
end

def remove_friend(person, friend_to_be_removed)
  person[:friends].delete(friend_to_be_removed)
end

def monies_total(people)
  total_monies = 0
  for person in people
    total_monies += person[:monies]
  end
  return total_monies
end

def loan_monies(lender, lendee, loan)
  lender_current_monies = lender[:monies]
  lendee_current_monies = lendee[:monies]
  lender[:monies] = (lender_current_monies - loan)
  lendee[:monies] = (lendee_current_monies + loan)
end

def all_favourite_foods(people)
  all_fav_foods = Array.new
  for person in people
    all_fav_foods.push(person[:favourites][:things_to_eat])
    # all_fav_foods.concat(person[:favourites][:things_to_eat])
  end
  return all_fav_foods.flatten
  # return all_fav_foods
end

def no_friends_finder(people)
  nae_pals = Array.new
  for person in people
    if person[:friends].length == 0
      nae_pals.push(person[:name])
    end
  end
  return nae_pals
end

# def same_tv_show(people)
#   previous_persons_fav_show = ""
#   people_with_same_show = Hash.new
#   for person in people
#     people_with_same_show[person[:name]] = person[:favourites][:tv_show]
#   end
#   # for value in people_with_same_show
#   #   fav_show =
#   # end
#   return people_with_same_show.values
# end

# def same_tv_show(people)
#   tv_shows = []
#   for person in people
#     tv_shows.push(person[:favourites][:tv_show])
#   end
#
#   same_show = []
#   count = 0
#
#   for show in tv_shows
#     if tv_shows.count(show) > 1
#       same_show.push(count)
#     end
#     count += 1
#   end
#
#   result = []
#   for index in same_show
#     result.push(people[index][:name])
#   end
#
#   return result
#
# end

def same_tv_show(people)
  tv_shows = {}
  same_tv_shows = {}

  for person in people
    show = person[:favourites][:tv_show]
    if tv_shows[show] != nil
      tv_shows[show] << person[:name]
    else
      tv_shows[show] = [person[:name]]
    end
  end

  for show_name in tv_shows.keys
    if tv_shows[show_name].length > 1
      same_tv_shows[show_name] = tv_shows[show_name]
    end
  end
  return same_tv_shows
end
