package main.java.baseball;

import main.java.controller.GameController;
import main.java.view.GameView;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        // TODO 구현 진행
        new GameController(scanner).initApplication();
    }
}