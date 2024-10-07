package org.example;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world!");

        // Define a lista de valores
        double[] values = {65, 51, 16, 11, 6519, 191, 0, 98, 19854, 1, 32};

        // Cria uma instância de DescriptiveStatistics
        DescriptiveStatistics stats = new DescriptiveStatistics();

        // Adiciona os valores ao objeto DescriptiveStatistics
        for (double value : values) {
            stats.addValue(value);
        }

        // Calcula as estatísticas descritivas
        double mean = stats.getMean();
        double median = stats.getPercentile(50);
        double standardDeviation = stats.getStandardDeviation();

        // Exibe os resultados
        System.out.println("Mean (Média): " + mean);
        System.out.println("Median (Mediana): " + median);
        System.out.println("Standard Deviation (Desvio Padrão): " + standardDeviation);
    }
}
