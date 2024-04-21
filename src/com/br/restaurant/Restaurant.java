package com.br.restaurant;

import java.io.*;

public class Restaurant {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String orderNameM[] = {" ", "Camarão", "Bobó", "Feijão", "Arroz", "Macarrão", "Carne", "Frango", "Nata De Coco", "Coca-Cola", "Sprite","Pepsi","Guaraná"};
		
		String orderNameP[] = {" ", "Camarão\tPhp 50.00", "Bobó\tPhp 50.00", "Feijão\tPhp 100.00", "Arroz\tPhp 150.00",
									"Pudim\t\tPhp 25.00", "Doce de Leite\t\tPhp 20.00", "Goiabada\t\tPhp 25.00", "Nata de Coco\tPhp 20.00",
								"Coca-Cola\t\t\tPhp 30.00", "Sprite\t\t\tPhp 30.00", "Pepsi\t\t\tPhp 25.00", "Guaraná\t\t\tPhp 25.00"};
		
		String user, pass, search, again ="", mainQ ="", mainQ2 ="", dessertQ ="", dessertQ2 = "", drinksQ ="", drinksQ2 ="";
		
		double orderPrice[] = {0.00, 50.00, 50.00, 100.00, 150.00, 25.00, 20.00, 25.00, 20.00, 30.0, 30.00, 25.00, 25.00 };
		
		int a = 0, b = 0, c = 0, d = 0, e = 1, g = 0, h = 0, i = 0, r = 0, choice = 0, order = 0, table = 1, end = 0;
		
		String orderString[][] = new String[50][20];
		String orderStringM[][] = new String[20][20];
		String orderStringP[][] = new String[20][20];
		
		double orderDoubleM[][] = new double[50][20];
		//double orderDoubleD[][] = new double[50][20];
		double tableNo[] = new double[21];
		double pieces[] = new double[13];
		double paid[] = new double[21];
		double totalOrder[] = new double[50];
		double totalPrice[] = new double[21];
		double orderDouble[][] = new double[21][20];
		double payment, change = 0;
		
		for (int z = 1; z <= 12; z++) {
			pieces[z] = 20;
		}
		
		while (a < 3) {
			System.out.print("Informe o nome de usuário: ");	
			user = in.readLine();
			
			System.out.print("Informe a senha: ");
			pass = in.readLine();
			
			if (user.equalsIgnoreCase("admin") && pass.equalsIgnoreCase("admin")) {
				System.out.println ("\n****************************************************");
				System.out.println ("********** BEM VINDO(a) AO FERREIRA COSTA **********");
	   		 	System.out.println ("****************************************************");
	   		 	
	   		 	do {
		   		 	//System.out.println ("\n **************************************");
		    		System.out.println ("\n ************** MENU **************");
		   		 	System.out.println (" **********************************");
		   		 	System.out.println("1) PEDIDO");
		   		 	System.out.println("2) INFORMAÇÃO DO PEDIDO");
		   		 	System.out.println("3) VALOR A COBRAR");
		   		 	System.out.println("4) INVENTÁRIO DE PRATOS");
		   		 	System.out.println("5) SAIR");
		   		 	System.out.println (" **********************************");
		   		 	
		   		 	for (int f = 1; f == 1;) {
		   		 		System.out.print("\nInforme a sua escolha: ");
		   		 		choice = Integer.parseInt(in.readLine());
		   		 		
		   		 		if (choice == 1) {
		   		 			do {
		   		 				for (int z = 1; z <= 12; z++) {
		   		 					orderString[b][z] = "O";
		   		 				}
		   		 				
		   		 				for (int x = 1; x == 1;) {
		   		 					System.out.print("Informe o nome do cliente: ");
		   		 					orderString[b][0] = in.readLine();
		   		 					
		   		 					x = 0;
		   		 					
		   		 					for (int l = 0; l < b; l++) {
		   		 						if (orderString[l][0].equalsIgnoreCase(orderString[b][0])) {
		   		 							System.out.println("Nome do cliente já utilizado!");
		   		 							
		   		 							x = 1;
		   		 						}
		   		 					}
		   		 				}
		   		 				
			   		 			c = 0;
			   		 				
			   		 			//System.out.println("\n *************************************");
				    			//System.out.println(" ************* CARDAPIO ************* ");
				    			//System.out.println(" *************************************");
				    			System.out.println("\n\n    *********** PRINCIPAL ***********");
				    			
			   		 			System.out.println("\nCamarão \t\tPreço: 50.00");
			   		 			
			   		 			if (pieces[1] > 0) {
			   		 				System.out.println("\t" + pieces[1] + " pcs.");
			   		 			} else {
			   		 				System.out.println("\t * Não Disponivel *");
			   		 			}
			   		 			
			   		 			System.out.println("Bobó \t\tPreço 50.00");
			   		 			
			   		 			if (pieces[2] > 0) {
			   		 				System.out.println("\t" + pieces[2] + " pcs.");
			   		 			} else {
			   		 				System.out.println("\t * Não Disponivel *");
			   		 			}
			   		 			
			   		 			System.out.println("Feijão \t\tPreço 150.00");
			   		 			
			   		 			if (pieces[3] > 0) {
			   		 				System.out.println("\t" + pieces[3] + " pcs.");
			   		 			} else {
			   		 				System.out.println("\t * Não Disponivel *");
			   		 			}
			   		 			
			   		 			System.out.println("Arroz \t\tPreço 150.00");
			   		 			
			   		 			if (pieces[4] > 0) {
			   		 				System.out.println("\t" + pieces[4] + " pcs.");
			   		 			} else {
			   		 				System.out.println("\t * Não Disponivel *");
			   		 			}
			   		 			
			   		 			System.out.println ("\n    *********** SOBREMESA ***********");
			   		 			System.out.println("Pudim \t\tPreço 25.00");
			   		 			
			   		 			if (pieces[5] > 0) {
			   		 				System.out.println("\t" + pieces[5] + " pcs.");
			   		 			} else {
			   		 				System.out.println("\t * Não Disponivel *");
			   		 			}
			   		 			
			   		 			System.out.println("Doce de Leite \t\tPreço 20.00");
			   		 			
			   		 			if (pieces[6] > 0) {
			   		 				System.out.println("\t" + pieces[7] + " pcs.");
			   		 			} else {
			   		 				System.out.println("\t * Não Disponivel *");
			   		 			}
			   		 			
			   		 			System.out.println("Goiabada \t\tPreço 25.00");
			   		 			
			   		 			if (pieces[7] > 0) {
			   		 				System.out.println("\t" + pieces[7] + " pcs.");
			   		 			} else {
			   		 				System.out.println("\t * Não Disponivel *");
			   		 			}
			   		 			
			   		 			System.out.println("Nata de Coco \t\tPreço 20.00");
			   		 			
			   		 			if (pieces[8] > 0) {
			   		 				System.out.println("\t" + pieces[8] + " pcs.");
			   		 			} else {
			   		 				System.out.println("\t * Não Disponivel");
			   		 			}
			   		 			
			   		 			System.out.println("\n    *********** BEBIDAS ************");
			   		 			System.out.println("Coca-Cola \t\tPreço 30.00");
			   		 			
			   		 			if (pieces[9] > 0) {
			   		 				System.out.println("\t" + pieces[9] + " pcs.");
			   		 			} else {
			   		 				System.out.println("\t * Não Disponivel *");
			   		 			}
			   		 			
			   		 			System.out.println("Sprite \t\tPreço 30.00");
			   		 			
			   		 			if (pieces[10] > 0) {
			   		 				System.out.println("\t" + pieces[10] + " pcs.");
			   		 			} else {
			   		 				System.out.println("\t * Não Disponivel *");
			   		 			}
			   		 			
			   		 			System.out.println("Pepsi \t\tPreço 25.00");
			   		 			
			   		 			if (pieces[11] > 0) {
			   		 				System.out.println("\t" + pieces[11] + " pcs.");
			   		 			} else {
			   		 				System.out.println("\t * Não Disponivel *");
			   		 			}
			   		 			
			   		 			System.out.println("Guaraná \t\tPreço 25.00");
			   		 			
			   		 			if (pieces[12] > 0) {
			   		 				System.out.println("\t" + pieces[12] + " pcs.");
			   		 			} else {
			   		 				System.out.println("\t * Não Disponivel *");
			   		 			}
			   		 			
			   		 			System.out.println ("\n****************************************************");
			   		 			
			   		 			if (pieces[1] == 0 && pieces[2] == 0 && pieces[3] == 0 && pieces[4] == 0) {
			   		 				System.out.println("\n Prato Principal Não Disponivel!");
			   		 			} else {
			   		 				for (int v = 1; v == 1;) {
			   		 					System.out.print("\nVocê deseja pedir o prato principal? [Y/N]: ");
			   		 					mainQ = in.readLine();
			   		 					
			   		 					if (mainQ.equalsIgnoreCase("y")) {
			   		 						do {
				   		 						//System.out.println ("\n\t ********** PRATO PRINCIPAL **********");
						    	 				System.out.println ("\n****************************************************");
						    	 				System.out.println (" NOME \t\t\t\t PREÇO");
						    	 				System.out.println ("1) Camarão " + "\t\t\t 50.00");
						    	 				
						    	 				if (pieces[1] > 0) {
						    	 					System.out.println("\t" + pieces[1] + " pcs.");
						    	 				} else {
						    	 					System.out.println("\t * Não Disponivel *");
						    	 				}
						    	 				
						    	 				System.out.println("2) Bobó " + "\t\t\t 50.00");
						    	 				
						    	 				if (pieces[2] > 0) {
						    	 					System.out.println("\t" + pieces[2] + " pcs.");
						    	 				} else {
						    	 					System.out.println("\t * Não Disponivel *");
						    	 				}
						    	 				
						    	 				System.out.println("3) Feijão " + "\t\t\t 100.00");
						    	 				
						    	 				if (pieces[3] > 0) {
						    	 					System.out.println("\t" + pieces[3] + " pcs.");
						    	 				} else {
						    	 					System.out.println("\t * Não Disponivel *");
						    	 				}
						    	 				
						    	 				System.out.println("4) Arroz " + "\t\t\t 100.00");
						    	 				
						    	 				if (pieces[4] > 0) {
						    	 					System.out.println("\t" + pieces[4] + " pcs.");
						    	 				} else {
						    	 					System.out.println("\t Não Disponivel");
						    	 				}
						    	 				
						    	 				System.out.println ("****************************************************");
						    	 				
						    	 				for (e = 1; e == 1;) {
						    	 					System.out.print("\nInsira o seu pedido: ");
						    	 					order = Integer.parseInt(in.readLine());
						    	 					
						    	 					for (v = 1; v <= 4; v++) {
						    	 						if (order == v) {
						    	 							if (orderString[b][v].equals("1")) {
						    	 								System.out.println("Prato já selecionado.");
						    	 								
						    	 								e = 1;
						    	 							} else if (pieces[v] == 0) {
						    	 								System.out.println("Prato não disponivel.");
						    	 								
						    	 								e = 1;
						    	 							} else {
						    	 								e = 0;
						    	 							}
						    	 						}
						    	 					}
						    	 					
						    	 					if (order < 1 || order > 4) {
						    	 						System.out.println("Entrada invalida.");
						    	 						
						    	 						e = 1;
						    	 					}
						    	 				}
						    	 				
						    	 				do {
						    	 					System.out.print("Quantos? ");
						    	 					orderDoubleM[b][c] = Double.parseDouble(in.readLine());
						    	 					
						    	 					for (v = 1; v == 4; v++) {
						    	 						if (order == v) {
						    	 							orderString[b][v] = "1";
						    	 							pieces[v] = pieces[v] - orderDoubleM[b][c];
						    	 							
						    	 							if (pieces[v] < 0) {
						    	 								pieces[v] = pieces[v] + orderDoubleM[b][c];
						    	 								
						    	 								System.out.println("Desculpe, só temos " + pieces[v] + "disponível.");
						    	 								
						    	 								v = 5;
						    	 								r = 1;
						    	 							} else {
						    	 								r = 0;
						    	 							}
						    	 						}
						    	 					}
						    	 				} while(r == 1);
						    	 				
						    	 				orderStringP[b][c] = orderNameP[order];
						    	 				orderStringM[b][c] = orderNameM[order];
						    	 				orderDouble[b][c] = orderPrice[order];
						    	 				
						    	 				c++;
						    	 				
						    	 				for (d = 1; d == 1;) {
						    	 					System.out.print("\nDeseja solicitar outro prato? [Y/N]: ");
						    	 					mainQ2 = in.readLine();
						    	 					
						    	 					if (mainQ2.equalsIgnoreCase("y")) {
						    	 						d = 0;
						    	 					} else if (mainQ2.contentEquals("n")) {
						    	 						System.out.print("");
						    	 						
						    	 						d = 0;
						    	 					} else {
						    	 						System.out.print("Entrada invalida.");
						    	 						
						    	 						d = 1;
						    	 					}
						    	 				}
						    	 				
						    	 				if (orderString[b][1].equals("1") && orderString[b][2].equals("1") && orderString[b][3].equals("1") && orderString[b][4].equals("1")) {
						    	 					System.out.println("Desculpe, você solicita todos os 4 pratos principais.");
						    	 					
						    	 					mainQ = "n";
						    	 				}
						    	 				
						    	 				if (pieces[1] == 0 && pieces[2] == 0 && pieces[3] == 0 && pieces[4] == 0) {
						    	 					System.out.println("\nPrato principal não disponivel.");
						    	 					
						    	 					mainQ2 = "n";
							    	 				}
			   		 						} while (mainQ.equalsIgnoreCase("y"));
			   		 					} else if (mainQ2.equalsIgnoreCase("n")) {
			   		 						v = 0;
			   		 					} else {
			   		 						System.out.println("Entrada invalida!");
			   		 						
			   		 						v = 1;
			   		 					}
			   		 				}
			   		 			}
				   		 		
				   		 		if (pieces[5] == 0 && pieces[6] == 0 && pieces[7] == 0 && pieces[8] == 0) {
				   		 			System.out.println("\nPrato principal não disponivel");
				   		 		} else {
				   		 			for (int v = 1; v == 1;) {
				   		 				System.out.println("\nGostaria de solicitar sobremesa? [Y/N]: ");
				   		 				
				   		 				dessertQ = in.readLine();
				   		 				
				   		 				if (dessertQ.equalsIgnoreCase("y")) {
				   		 					do {
					   		 					//System.out.println("\n\t ********** SOBREMESA **********");
							    	 			System.out.println("\n****************************************************");
								    	 		System.out.println(" NOME\t\t\t\tPREÇO");
								    	 		
								    	 		System.out.println("1) Pudim \t\t\t 25.00");
								    	 		
								    	 		if (pieces[5] > 0) {
								    	 			System.out.println("\t" + pieces[5] + " pcs.");
								    	 		} else {
								    	 			System.out.println("\t * Não disponivel *");
								    	 		}
								    	 		
								    	 		System.out.println("2) Doce de Leite \t\t\t 20.00");
								    	 		
								    	 		if (pieces[6] > 0) {
								    	 			System.out.println("\t" + pieces[6] + " pcs.");
								    	 		} else {
								    	 			System.out.println("\t * Não disponivel *");
								    	 		}
								    	 		
								    	 		System.out.println("3) Goiabada \t\t\t 25.00");
								    	 		
								    	 		if (pieces[7] > 0) {
								    	 			System.out.println("\t" + pieces[7] + " pcs." );
								    	 		} else {
								    	 			System.out.println("\t * Não disponivel *");
								    	 		}
								    	 		
								    	 		System.out.println("4) Nata de Coco \t\t\t 20.00");
								    	 		
								    	 		if (pieces[8] > 0) {
								    	 			System.out.println("\t" + pieces[8] + " pcs.");
								    	 		} else {
								    	 			System.out.println("\t * Não disponivel *");
								    	 		}
								    	 		
								    	 		System.out.println ("****************************************************");
								    	 		
								    	 		for (e = 1; e == 1;) {
								    	 			System.out.println("\nInsira o seu pedido: ");
								    	 			order = Integer.parseInt(in.readLine());
								    	 			
								    	 			order += 4;
								    	 			
								    	 			for (v = 5; v <= 8; v++) {
								    	 				if (order == v) {
								    	 					if (orderString[b][v].equals("1")) {
								    	 						System.out.println("Sobremesa já selecionada.");
								    	 						
								    	 						e = 1;
								    	 					} else if (pieces[v] == 0) {
								    	 						System.out.println("Sobremesa não disponivel.");
								    	 						
								    	 						e = 1;
								    	 					} else {
								    	 						e = 0;
								    	 					}
								    	 				}
								    	 			}
								    	 			
								    	 			if (order < 5 || order > 8) {
									    	 			System.out.println("Entrada invalida.");
									    	 			
									    	 			e = 1;
									    	 		}
								    	 		}
								    	 		
								    	 		do {
								    	 			System.out.println("Quantos? ");
								    	 			orderDoubleM[b][c] = Double.parseDouble(in.readLine());
								    	 			
								    	 			for (v = 5; v <= 8; v++) {
								    	 				if (order == v) {
								    	 					orderString[b][c] = "1";
								    	 					pieces[v] = pieces[v] - orderDoubleM[b][c];
								    	 					
								    	 					if (pieces[v] < 0) {
								    	 						pieces[v] = pieces[v] + orderDoubleM[b][c];
								    	 						
								    	 						System.out.println("Desculpe, só temos " + pieces[v] + " pcs, disponivel.");
								    	 						
								    	 						v = 9;
								    	 						r = 1;
								    	 					} else {
								    	 						r = 0;
								    	 					}
								    	 				}
								    	 			}
								    	 		} while (r == 1);
								    	 		
								    	 		
								    	 		orderStringP[b][c] = orderNameP[order];
								    	 		orderStringM[b][c] = orderNameM[order];
								    	 		orderDouble[b][c] = orderPrice[order];
								    	 		
								    	 		c++;
								    	 		
								    	 		for (d = 1; d == 1;) {
								    	 			System.out.print("\nDeseja solicitar outra sobremesa? [Y/N]: ");
								    	 			dessertQ2 = in.readLine();
								    	 			
								    	 			if (dessertQ2.equalsIgnoreCase("y")) {
								    	 				d = 0;
								    	 			} else if (dessertQ2.equalsIgnoreCase("n")) {
								    	 				d = 0;
								    	 				dessertQ = "n";
								    	 			} else {
								    	 				System.out.println("Entrada invalida.");
								    	 				
								    	 				d = 1;
								    	 			}
								    	 		}
								    	 		
								    	 		if (orderString[b][5].equalsIgnoreCase("1") && orderString[b][6].equals("1") && orderString[b][7].equals("1") && orderString[b][8].equals("1")) {
								    	 			System.out.println("Desculpe, você já pediu todas as 4 opções de sobremesa.");
								    	 			
								    	 			dessertQ2 = "n";
								    	 		}
								    	 		
								    	 		if (pieces[1] == 0 && pieces[2] == 0 && pieces[3] == 0 && pieces[4] == 0) {
								    	 			System.out.println("\nPrato Principal não disponivel.");
								    	 			
								    	 			dessertQ2 = "n";
								    	 		}
								    	 		
				   		 					} while (dessertQ.equalsIgnoreCase("y"));
				   		 				} else if (dessertQ2.equalsIgnoreCase("n")) {
				   		 					v = 0;
				   		 				} else {
				   		 					System.out.print("Entrada invalida.");
				   		 					
				   		 					v = 1;
				   		 				}
				   		 			}
				   		 		}
				   		 		
				   		 		if (pieces[5] == 0 && pieces[6] == 0 && pieces[7] == 0 && pieces[8] == 0) {
				   		 			System.out.println("\nSobremesa não disponivel.");
				   		 		} else {
				   		 			for (int v = 1; v == 1;) {
				   		 				System.out.println("\nDeseja solicitar bebidas? [Y/N]: ");
				   		 				drinksQ = in.readLine();
				   		 				
				   		 				if (drinksQ.equalsIgnoreCase("y")) {
				   		 					do {
					   		 					//System.out.println ("\n\t ********** BEBIDAS **********");
								    	 		System.out.println ("\n****************************************************");
								    	 		System.out.println (" NOME\t\t\t\tPREÇO");
								    	 		
								    	 		System.out.print ("1) Coca-Cola \t\t\t 30.00");
								    	 		
								    	 		if (pieces[9] > 0) {
								    	 			System.out.println("\t" + pieces[9] + " pcs.");
								    	 		} else {
								    	 			System.out.println("\t * Não Disponivel *");
								    	 		}
								    	 		
								    	 		System.out.print("2) Sprite \t\t\t 30.00");
								    	 		
								    	 		if (pieces[10] > 0) {
								    	 			System.out.println("\t" + pieces[10] + " pcs.");
								    	 		} else {
								    	 			System.out.println("\t * Não Disponivel*");
								    	 		}
								    	 		
								    	 		System.out.print("3) Pepsi \t\t\t 25.00");
								    	 		
								    	 		if (pieces[11] > 0) {
								    	 			System.out.println("\t" + pieces[11] + " pcs.");
								    	 		} else {
								    	 			System.out.println("\t * Não Disponivel*");
								    	 		}
								    	 		
								    	 		System.out.print("4) Guaraná \t\t\t 25.00");
								    	 		
								    	 		if (pieces[12] > 0) {
								    	 			System.out.println("\t" + pieces[12] + " pcs.");
								    	 		} else {
								    	 			System.out.println("\t * Não Disponivel*");
								    	 		}
								    	 		
								    	 		System.out.println ("****************************************************");
								    	 		
								    	 		for (e = 1; r == 1;) {
								    	 			System.out.print("\nInsira o seu pedido: ");
								    	 			order = Integer.parseInt(in.readLine());
								    	 			
								    	 			order += 8;
								    	 			
								    	 			for (v = 9; v <= 12; v++) {
								    	 				if (order == v) {
								    	 					if (orderString[b][v].equals("1")) {
								    	 						System.out.println("Esta bebida já existe na lista!");
								    	 						
								    	 						e = 1;
								    	 					} else {
								    	 						e = 0;
								    	 					}
								    	 				}
								    	 			}
								    	 			
								    	 			if (order < 9 || order > 12) {
								    	 				System.out.println("Entrada invalida!");
								    	 				
								    	 				e = 1;
								    	 			}
								    	 		}
								    	 		
								    	 		orderStringP[b][c] = orderNameP[order];
								    	 		orderStringM[b][c] = orderNameM[order];
								    	 		orderDouble[b][c] = orderPrice[order];
								    	 		
								    	 		do {
								    	 			System.out.print("Quantos? ");
								    	 			orderDoubleM[b][c] = Double.parseDouble(in.readLine());
								    	 			
								    	 			for (v = 9; v <= 12; v++) {
								    	 				if (order == v) {
								    	 					orderString[b][c] = "1";
								    	 					pieces[v] = pieces[v] - orderDoubleM[b][c];
								    	 					
								    	 					if (pieces[v] < 0) {
								    	 						pieces[v] = pieces[v] + orderDoubleM[b][c];
								    	 						
								    	 						System.out.println("Desculpe, só temos " + pieces[v] + "pcs, disponivel.");
								    	 						
								    	 						v = 13;
								    	 						r = 1;
								    	 					} else {
								    	 						r = 0;
								    	 					}
								    	 				}
								    	 			}
								    	 		} while (r == 1);
								    	 		
								    	 		c++;
								    	 		
								    	 		for (d = 1; d == 1;) {
								    	 			System.out.print("\nDeseja solicitar outra bebida? [Y/N]: ");
								    	 			drinksQ2 = in.readLine();
								    	 			
								    	 			if (drinksQ2.equalsIgnoreCase("y")) {
								    	 				d = 0;
								    	 				c++;
								    	 			} else if (drinksQ2.equalsIgnoreCase("n")) {
								    	 				System.out.print("");
								    	 				
								    	 				d = 0;
								    	 				f = 0;
								    	 			} else {
								    	 				System.out.print("Entrada invalida!");
								    	 				
								    	 				d = 1;
								    	 			}
								    	 		}
								    	 		
								    	 		if (orderString[b][9].equals("1") && orderString[b][10].equals("1") && orderString[b][11].equals("1") && orderString[b][12].equals("1")) {
								    	 			System.out.print("Desculpe, você já pediu todas as 4 opções de bebidas.");
								    	 			
								    	 			drinksQ = "n";
								    	 			f = 0;
								    	 		}
								    	 		
								    	 		if (pieces[9] == 0 && pieces[10] == 0 && pieces[11] == 0 & pieces[12] == 0) {
								    	 			System.out.println("\nBebida não disponivel.");
								    	 			
								    	 			drinksQ2 = "n";
								    	 			f = 0;
								    	 		}
								    	 		
				   		 					} while(drinksQ2.equalsIgnoreCase("y"));
				   		 				} else if (drinksQ.equalsIgnoreCase("n")) {
				   		 					v = 0;
				   		 					f = 0;
				   		 				} else {
				   		 					System.out.print("Entrada invalida.");
				   		 					
				   		 					v = 1;
				   		 				}
				   		 			}
				   		 		}
				   		 		
				   		 		if (c == 0) {
				   		 			System.out.println("Você não tem nenhum pedido.");
				   		 			
				   		 			r = 1;
				   		 		} else {
				   		 			c--;
				   		 		}
				 			
		   		 			} while (r == 1);
		   		 			
		   		 			tableNo[b] = table;
		   		 			totalOrder[b] = c;
		   		 			paid[b] = 0;
		   		 			
		   		 			System.out.println("\nVocê é a mesa Nº " + tableNo[b]);
		   		 			System.out.println("Seu pedido: ");
		   		 			
		   		 			for (int y = 0; y <= totalOrder[b]; y++) {
		   		 				System.out.println(" " + orderDoubleM[b][y] + " pcs. \t" + orderStringM[b][y]);
		   		 				
		   		 				totalPrice[b] = totalPrice[b] + (orderDouble[b][y] * orderDoubleM[b][y]);
		   		 			}
		   		 			
		   		 			table++;
		   		 			b++;
		   		 		} else if (choice == 2) {
		   		 			do {
		   		 				System.out.println("\nInsira o nome do cliente: ");
		   		 				search = in.readLine();
		   		 				
		   		 				int s = 1;
		   		 				
		   		 				for (int x = 0; x < b; x++) {
		   		 					if (search.equalsIgnoreCase(orderString[x][0])) {
		   		 						System.out.println(" ******   INFORMAÇÕES DO PEDIDO DO CLIENTE   *******");
		   		 						System.out.println(" Nome: " + orderString[x][0]);
		   		 						System.out.println("Nº Mesa: " + tableNo[x]);
		   		 						System.out.println(" Pedido: ");
		   		 						
		   		 						for (int y = 0; y <= totalOrder[x]; y++) {
		   		 							System.out.println(" " + orderDouble[x][y] + " pcs \t" + orderStringP[x][y]);
		   		 						}
		   		 						
		   		 						System.out.println(" --------------------------------------");
		   		 						System.out.print("Fatura Total: " + totalPrice[x]);
		   		 						
		   		 						if (paid[x] == 1) {
		   		 							System.out.println("* PAGO *");
		   		 							System.out.println("**************************************");
		   		 						} else {
		   		 							System.out.println("*NÃO PAGO*");
		   		 							System.out.println ("**************************************");
		   		 							System.out.println("\nFavor, realizar o pagamento.");
		   		 						}
		   		 						
		   		 						 s = 0;
		   		 					}
		   		 				}
		   		 				
		   		 				if (s == 1) {
		   		 					System.out.println("Nome do cliente não encontrado.");
		   		 					
		   		 					g = 1;
		   		 				} else {
		   		 					g = 0;
		   		 				}
		   		 				
		   		 				f = 0;	
		   		 			} while (g == 1);
		   		 		} else if (choice == 3) {
		   		 			do {
		   		 				System.out.println("\nInsira o nome do cliente: ");
		   		 				search = in.readLine();
		   		 				
		   		 				int s = 1;
		   		 				
		   		 				for (int x = 0; x < b; x++) {
		   		 					if (search.equalsIgnoreCase(orderString[x][0])) {
		   		 						System.out.println(" ****   RECIBO DO PEDIDO DO CLIENTE   ****");
		   		 						System.out.println("Nome: " + orderString[x][0]);
		   		 						System.out.println("Nº Mesa: " + tableNo[x]);
		   		 						System.out.println("Pedido: ");
		   		 						
		   		 						for (int y = 0; y <= totalOrder[x]; y++) {
		   		 							System.out.println(" " + orderDoubleM[x][y] + " pcs \t" + orderStringP[x][y]);
		   		 						}
		   		 						
		   		 						System.out.println (" **************************************");
		   		 						System.out.println("Fatura Total: " + totalPrice[x]);
		   		 						
		   		 						if (paid[x] == 1) {
		   		 							System.out.println("* PAGO *");
		   		 							System.out.println (" **************************************");
		   		 						} else {
		   		 							System.out.println ("\n **************************************");
		   		 							
		   		 							for (int m = 1; m == 1;) {
		   		 								System.out.println("Insira o pagamento: ");
		   		 								payment = Double.parseDouble(in.readLine());
		   		 								
		   		 								change = payment - totalPrice[x];
		   		 								
		   		 								if (change < 0) {
		   		 									m = 1;
		   		 									
		   		 									System.out.println("Saldo insuficiente. Favor tentar novamente!");
		   		 								} else {
		   		 									paid[x] = 1;
		   		 									m = 0;
		   		 								}
		   		 							}
		   		 							
		   		 							System.out.println("Alteração: " + change);
		   		 						}
		   		 						
		   		 						s = 0;
		   		 					}
		   		 				}
		   		 				
		   		 				if (s == 1) {
		   		 					System.out.println("Nome do cliente não encontrado.");
		   		 					
		   		 					h = 1;
		   		 				} else {
		   		 					h = 0;
		   		 				}
		   		 				
		   		 				f = 0;
		   		 			} while (h == 1);
		   		 		} else if (choice == 4) {
			   		 		System.out.println(" ********** INVENTÁRIO **********");
			    	 		System.out.println (" **************************************");
			    	 		System.out.println ("\n   *********** PRATO PRINCIPAL ***********");
			    	 		System.out.println ("   **********************************");
			    	 		
			    	 		for (int z = 1; z <= 4; z++) {
			    	 			System.out.println(" \t" + pieces[z] + " pcs \t\t" + orderNameM[z]);
			    	 		}
			    	 		
			    	 		System.out.println ("   ************ SOBREMESA *************");
			    	 		System.out.println ("   **********************************");
			    	 		
			    	 		for (int z = 5; z <= 8; z++) {
			    	 			System.out.println(" \t" + pieces[z] + " pcs \t\t" + orderNameM[z]);
			    	 		}
			    	 		
			    	 		System.out.println ("   ************* BEBIDAS *************");
			    	 		System.out.println ("   **********************************");
			    	 		
			    	 		for (int z = 9; z <= 12; z++) {
			    	 			System.out.println(" \t" + pieces[z] + " pcs \t\t" + orderNameM[z]);
			    	 		}
			    	 		
			    	 		System.out.println (" **************************************");
			    	 		
			    	 		f = 0;
		   		 		} else if (choice == 5) {
		   		 			f = 0;
		   		 			end = 1;
		   		 			again = "n";
		   		 			
		   		 			System.out.println("Agradecemos a sua presença e volte sempre!");
		   		 		} else {
		   		 			System.out.println("Entrada invalida");
		   		 			
		   		 			f = 1;
		   		 		}
		   		 	}
		   		 	
		   		 	if (end == 0) {
		   		 		do {
		   		 			System.out.print("\nDeseja realizar outra transação [Y/N]? ");
		   		 			again = in.readLine();
		   		 			
		   		 			if (again.equalsIgnoreCase("n")) {
		   		 				i = 0;
		   		 			} else if (again.equalsIgnoreCase("y")) {
		   		 				i = 0;
		   		 			} else {
		   		 				System.out.println("Entrada invalida!");
		   		 				i = 1;
		   		 			}
		   		 		} while (i == 1);
		   		 	}
		   		 	
	   		 	} while (again.equalsIgnoreCase("y"));
	   		 	
	   		 	break;
			} else {
				System.out.println("\nUsuário ou senha invalida!\n");
				
				a++;
			}
		}
	}
}
