package org.example;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

public class Main {
    public static void main(String[] args) {
        // Definir os valores
        double[] values = new double[] {65, 51, 16, 11, 6519, 191, 0, 98, 19854, 1, 32};

        // Criar uma instância de DescriptiveStatistics
        DescriptiveStatistics descriptiveStatistics = new DescriptiveStatistics();

        // Adicionar os valores à estatística descritiva
        for (double v : values) {
            descriptiveStatistics.addValue(v);
        }

        // Calcular estatísticas
        double mean = descriptiveStatistics.getMean();
        double median = descriptiveStatistics.getPercentile(50);
        double standardDeviation = descriptiveStatistics.getStandardDeviation();

        // Exibir os resultados no console
        System.out.println("Média: " + mean);
        System.out.println("Mediana: " + median);
        System.out.println("Desvio Padrão: " + standardDeviation);
    }
}
