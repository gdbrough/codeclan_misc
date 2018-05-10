const tweetGetter = {
  getTweets: function(callback){
    // do some stuff
    // .....
    // that takes some time
    callback();
  },

  renderHeader: function(){
    // create an <h1 />
  },

  render: function(){
    // console.log(this);
    this.getTweets(function(){
      console.log(this);
      // this.renderHeader()
    }.bind(this));
  }
};

tweetGetter.render();
