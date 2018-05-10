require('pry-byebug')
require_relative('models/bounty.rb')

bounty1 = Bounty.new({
  'name' => 'Ja Ja Binks',
  'species' => 'Gungan',
  'value' => '1',
  'collected_by' => 'Jango Fett'
  })

bounty2 = Bounty.new({
  'name' => 'Han Solo',
  'species' => 'Human',
  'value' => '1000',
  'collected_by' => 'Boba Fett'
  })

bounty1.save()
bounty2.save()

bounty1.delete()

bounty2.value = 5000
bounty2.update()

binding.pry
nil
