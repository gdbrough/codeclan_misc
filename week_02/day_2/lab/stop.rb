class Stop

  attr_reader :name, :queue

  def initialize(name, queue)
    @name = name
    @queue = queue
  end

  def add_queueing_passenger(passenger)
    @queue.push(passenger)
  end

  def get_queue_copy()
    copy = @queue
    return copy
  end

  def clear_queue()
    @queue.clear()
  end

end
