class Bus

  attr_reader :route_number, :destination, :passengers

  def initialize(route_number, destination, passengers)
    @route_number = route_number
    @destination = destination
    @passengers = passengers
  end

  def drive
    return "Brum Brum"
  end

  def pick_up(new_passenger)
    @passengers.push(new_passenger)
  end

  def drop_off(passenger)
    @passengers.delete(passenger)
  end

  def empty()
    @passengers = []
    # @passengers.clear #better
  end

  # def pick_up_from_stop(stop)
  #   if @stop.name = stop
  #     @passengers.concat(@stop.queue(stop_name))
  #   end
  # end

  def pick_up_from_stop(stop)
    for person in stop.get_queue_copy()
      pick_up(person)
    end
    stop.clear_queue
  end

end
