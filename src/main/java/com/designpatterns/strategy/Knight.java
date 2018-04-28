package com.designpatterns.strategy;

public class Knight {

    private Quest quest;

    public Knight(Quest quest) {
        this.quest = quest;
    }

    public void setQuest(Quest quest) {
        this.quest = quest;
    }

    public void play() {
        quest.perform();
    }
}
