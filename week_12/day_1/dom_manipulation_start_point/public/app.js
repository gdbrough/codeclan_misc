// 1. create parent container and its class
var createQuoteArticle = function(){
  let quoteArticle = document.createElement("article");
  quoteArticle.classList.add("quote");
  return quoteArticle;
};

// 2. Create first child, blockquote, and its text
var createBlockQuote = function(quoteText){
  let blockquote = document.createElement("blockquote");
  blockquote.innerText = quoteText + " ";
  return blockquote;
};

// 3. Create the cite element and its text
const createCite = function(author){
  let citeElement = document.createElement("cite");
  citeElement.innerText = author;
  return citeElement;
};

var appendElements = function(quoteArticle, blockquote, citeElement){
// 4. Append the cite to the blockquote
  blockquote.appendChild(citeElement);

// 5. Append the blockquote to the article
  quoteArticle.appendChild(blockquote);

// 6. Add the article to the list of quotes.
  let quotes = document.querySelector("#quotes");
  quotes.appendChild(quoteArticle)
};


var addQuote = function(author, quoteText) {
  var quoteArticle = createQuoteArticle();
  var blockQuote = createBlockQuote(quoteText);
  console.log(blockQuote);
  var cite = createCite(author);

  appendElements(quoteArticle, blockQuote, cite);
}

var app = function(){
  author = "Someone Wise";
  quoteText = "Assumption is the mother of all fuck ups.";
  // debugger;
  addQuote(author, quoteText);
}



window.onload = app;
// window.onload = addQuote("Someone Wise", "Assumption is the mother of all fuck ups");
