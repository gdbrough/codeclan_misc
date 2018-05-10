avengers = {
  iron_man: {
    name: "Tony Stark",
    moves:{
      punch: 10,
      kick: 100
    }
  },
  hulk: {
    name: "Bruce Banner",
    moves: {
      smash: 1000,
      roll: 500
    }
  }
}

p avengers[:hulk][:name]
p avengers[:iron_man][:moves][:kick]
p avengers.keys() 
