int[][] matriz = new int[5][5];

        System.out.println("Insira os valores da matriz:");

        for (int i = 1; i < matriz.length; i++) {
            for (int j = 1; j < matriz[i].length; j++) {
                System.out.print("Valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextInt();
            }
            
        }
        int valorTotal=0;
        System.out.println("│i,1│i,2│i,3│i,4│");
            for (int i = 1; i < matriz.length; i++) {
                for (int j = 1; j < matriz[i].length; j++) {
                    System.out.print("│ "+matriz[i][j] + " ");
                }
                System.out.println("│"+i+",j");
            }
            System.out.print("Digite onde quer começar 'i': ");
            int i = input.nextInt();
            System.out.print("Digite onde quer começar 'j': ");
            int j = input.nextInt();
            System.out.println("Você começou na cidade da posição "+i+","+j);
            int oldi=0;
            int oldj=0;
            
        while (true){
            System.out.println("│i,1│i,2│i,3│i,4│");
            for (i = 1; i < matriz.length; i++) {
                for (j = 1; j < matriz[i].length; j++) {
                    System.out.print("│ "+matriz[i][j] + " ");
                }
                System.out.println("│"+i+",j");
            }
            System.out.print("Digite a posição 'i' da cidade: ");
            int I = input.nextInt();
            System.out.print("Digite a posição 'j' da cidade: ");
            int J = input.nextInt();
            
            if (I==oldi && J==oldj) {
                System.out.println("Você não mudou de cidade portanto a distância percorrida não aumenta!");
                System.out.println(valorTotal+"Kms percorridos");
            } else {

            if (I >= 0 && I < matriz.length && J >= 0 && J < matriz[I].length) {
                int valor = matriz[I][J];
                valorTotal = valor+valorTotal;
                oldi=I;
                oldj=J;
                System.out.println("Você foi para " + I + "," + J + " e percorreu " + valor + "Km");
                System.out.println("Total percorrido: "+valorTotal+"Km");
            } else {
                System.out.println("Posição inválida.");
            }
        }
            
        }
	}
}