# Testing task 1:

## Carry out static testing on the code below.

### Read through code below and comment on any errors you can spot.

#### Don't correct the errors!


```ruby
class CardGame

# missing attr reader

  def initialize(suit, value)
    @suit = suit
    @value = value;
  end

  def checkforAce(card)
    if card.value = 1
      return true
    else
      return false
    end
  end

# "dif" not def
  dif highest_card(card1 card2)
  if card1.value > card2.value
    return card.name #name? which card?
  else
    card2
  end  
end
end

# exists outwith class
def self.cards_total(cards)
  total #uninitialised variable
  for card in cards
    total += card.value
    return "You have a total of" + total
  end
end

```
