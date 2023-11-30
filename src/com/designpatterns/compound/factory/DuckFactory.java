package com.designpatterns.compound.factory;

import com.designpatterns.compound.entities.DuckCall;
import com.designpatterns.compound.entities.MallardDuck;
import com.designpatterns.compound.entities.Quackable;
import com.designpatterns.compound.entities.RedheadDuck;
import com.designpatterns.compound.entities.RubberDuck;

public class DuckFactory extends AbstractDuckFactory {

        @Override
        public Quackable createMallardDuck(){
            return new MallardDuck();
        }

        @Override
        public Quackable createRedheadDuck(){
            return new RedheadDuck();
        }

        @Override
        public Quackable createDuckCall(){
            return new DuckCall();
        }

        @Override
        public Quackable createRubberDuck(){
            return new RubberDuck();
        }
}
