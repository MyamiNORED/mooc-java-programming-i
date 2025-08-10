
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Myami
 */
public class Stats {

    private ArrayList<Integer> points;
    private ArrayList<Integer> passingsGrades;

    public Stats() {
        this.points = new ArrayList<>();
        this.passingsGrades = new ArrayList<>();

    }

    public void addPoints(int point) {
        this.points.add(point);
        if (point >= 50) {
            this.passingsGrades.add(point);
        }
    }

    public double averageAll() {
        if (this.points.size() == 0) {
            return 0;
        }

        int sum = 0;
        for (int a : points) {
            sum += a;
        }
        return (sum * 1.0) / this.points.size();
    }

    public double averagePassing() {
        if (this.passingsGrades.size() == 0) {
            return 0;
        }

        int sum = 0;
        for (int a : passingsGrades) {
            sum += a;
        }
        return (sum * 1.0) / this.passingsGrades.size();
    }

    public double passPercentage() {

        if (this.points.size() == 0) {
            return 0.0;
        }

        return 100.0 * ((this.passingsGrades.size() * 1.0) / this.points.size());
    }

    public void gradeDistribution() {
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ":");

            for (int j = 0; j < this.points.size(); j++) {
                if (i == 5 && this.points.get(j) >= 90) {
                    System.out.print("*");
                } else if (i == 4 && this.points.get(j) < 90 && this.points.get(j) >= 80) {
                    System.out.print("*");
                } else if (i == 3 && this.points.get(j) < 80 && this.points.get(j) >= 70) {
                    System.out.print("*");
                } else if (i == 2 && this.points.get(j) < 70 && this.points.get(j) >= 60) {
                    System.out.print("*");
                } else if (i == 1 && this.points.get(j) < 60 && this.points.get(j) >= 50) {
                    System.out.print("*");
                } else if (i == 0 && this.points.get(j) < 50) {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
    }

}
