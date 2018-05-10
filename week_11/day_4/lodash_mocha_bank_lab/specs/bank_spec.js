var assert = require('assert');
var Bank = require('../bank.js');
var Account = require('../account.js');

describe('Bank', function() {

  var account1;
  var account2;
  var account3;
  var account4;
  var bank;

  beforeEach(function() {
    account1 = new Account("Sian", 60, 'personal');
    account2 = new Account("Keith", 10, 'business');
    account3 = new Account("Harrison", 80, 'personal');
    account4 = new Account("Craig", 5, 'business');
    bank = new Bank();
    bank.addAccount(account1);
    bank.addAccount(account2);
    bank.addAccount(account3);
    bank.addAccount(account4);
  });

  it("should be able to add an account", function() {
    assert.strictEqual(bank.accounts.length, 4);
  });

  it("should find account by name", function(){
    assert.deepEqual(bank.accountByName("Craig"), account4);
  });

  it("should find the largest account", function(){
    assert.deepEqual(bank.largestAccount(), account3);
  });

  it("should find total value of all accounts", function(){
    assert.strictEqual(bank.totalValue(), 155);
  });

  it("should find average value of all accounts", function(){
    assert.strictEqual(bank.averageValue(), 38.75);
  });

  it("should find the total value for a certain account type", function(){
    assert.strictEqual(bank.totalValueForType("business"), 15)
  });



});
