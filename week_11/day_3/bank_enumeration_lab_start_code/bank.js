var Bank = function() {
  this.accounts = [];
}

Bank.prototype.addAccount = function (account) {
  this.accounts.push(account);
}

Bank.prototype.accountByName = function (name) {
  return this.accounts.find(function(account){
      return account.name === name;
  });
};

Bank.prototype.largestAccount = function () {
  let highestValue = 0;
  this.accounts.forEach(function(account){
    if (account.value > highestValue){
      highestValue = account.value;
    };
  });
  return this.accounts.find(function(account){
    return account.value === highestValue;
  });
};

Bank.prototype.payInterest = function () {
  this.accounts.forEach(function(account){
    account.value *= 1.1;
  });
};

Bank.prototype.businessAccounts = function () {
  return this.accounts.filter(account => account.type === "business");
};

Bank.prototype.totalValue = function () {
  let totalValue = 0;
  this.accounts.forEach(function(account){
      totalValue += account.value;
  });
  return totalValue;
};

Bank.prototype.averageValue = function () {
  return this.totalValue() / this.accounts.length;
};

module.exports = Bank;
