package com.company;

public class Player implements Inputtable {
    static int count = 0;
    private String name ;
    private int numWin;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void getKeyboardInput(int x, int y) {

        if (x > 15 || y > 15 || x <= 0 || y <= 0) {
            System.out.println("다시 입력하세요.");
        } else {
            if (count % 2 == 0) {
                Position.stage[x - 1][y - 1] = 1;
            } else if (count % 2 == 1) {
                Position.stage[x - 1][y - 1] = 2;
            }
            count++;
        }
    }
}