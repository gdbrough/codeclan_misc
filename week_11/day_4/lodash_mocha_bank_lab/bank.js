const _ = require("lodash");

var Bank = function() {
  this.accounts = [];
}

Bank.prototype.addAccount = function (account) {
  this.accounts.push(account);
}

Bank.prototype.accountByName = function (name) {
  return _.find(this.accounts, account => account.name === name);
};

Bank.prototype.largestAccount = function () {
  return _.maxBy(this.accounts, account => account.value);
};

Bank.prototype.totalValue = function () {
  return _.sumBy(this.accounts, account => account.value);
};

Bank.prototype.averageValue = function () {
  return _.meanBy(this.accounts, account => account.value);
};

Bank.prototype.totalValueForType = function (accType) {
  var accArray = _.filter(this.accounts, account => account.type === accType);
  return _.sumBy(accArray, account => account.value);
};


module.exports = Bank;
