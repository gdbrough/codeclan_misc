package models;

import behaviours.IPlay;
import behaviours.ISell;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Instrument extends StockItem implements IPlay {
    private String colour;
    private InstrumentType type;

    public Instrument() {
    }

    public Instrument(int buyPrice, int sellPrice, String colour, InstrumentType type) {
        super(buyPrice, sellPrice);
        this.colour = colour;
        this.type = type;
    }

    @Column(name = "colour")
    public String getColour() {
        return this.colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Column(name = "type")
    public InstrumentType getType() {
        return this.type;
    }

    public void setType(InstrumentType type) {
        this.type = type;
    }
}
