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
		
		int a = 0, b = 0, c = 0, d = 0, e = 1, g = 0, h = 0, i = 0, r = 0, choice = 0, choice1 = 0, order = 0, table = 1, end = 0;
		
		String orderString[][] = new String[50][20];
		String orderStringM[][] = new String[20][20];
		String orderStringP[][] = new String[20][20];
		
		double orderDoubleM[][] = new double[50][20];
		double orderDoubleD[][] = new double[50][20];
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
				System.out.println ("\n ******************************************************");
	    		System.out.println (" ********** BEM VINDO(a) AO FERREIRA COSTA **********");
	   		 	System.out.println (" *******************************************************");
	   		 	
	   		 	do {
		   		 	System.out.println ("\n **************************************");
		    		System.out.println (" ********** CARDAPIO PRINCIPAL **********");
		   		 	System.out.println (" ****************************************");
		   		 	System.out.println("1) - PEDIDO");
		   		 	System.out.println("2) - INFORMAÇÃO DO PEDIDO");
		   		 	System.out.println("3) - VALOR A COBRAR");
		   		 	System.out.println("4) - INVENTÁRIO DE PRATOS");
		   		 	System.out.println("5) - SAIR");
		   		 	System.out.println (" ***************************************");
		   		 	
		   		 	for (int f = 1; f == 1;) {
		   		 		System.out.println("\nInforme a sua escolha: ");
		   		 		choice = Integer.parseInt(in.readLine());
		   		 		
		   		 		if (choice == 1) {
		   		 			do {
		   		 				for (int z = 1; z <= 12; z++) {
		   		 					orderString[b][z] = "O";
		   		 				}
		   		 				
		   		 				for (int x = 1; x == 1;) {
		   		 					System.out.println("\nInforme o nome do cliente: ");
		   		 					orderString[b][0] = in.readLine();
		   		 					
		   		 					x = 0;
		   		 					
		   		 					for (int l = 0; l <= b; l++) {
		   		 						if (orderString[l][0].equalsIgnoreCase(orderString[b][0])) {
		   		 							System.out.println("Nome do cliente já utilizado!");
		   		 							
		   		 							x = 1;
		   		 						}
		   		 					}
		   		 				}
		   		 				
			   		 			c = 0;
			   		 				
			   		 			System.out.println("\n *************************************");
				    			System.out.println(" ************* CARDAPIO ************* ");
				    			System.out.println(" *************************************");
				    			System.out.println("\n    ********** CARDAPIO PRINCIPAL **********");
				    			
			   		 			System.out.println("\n Camarão \t\tPhp 50.00");
			   		 			
			   		 			if (pieces[1] > 0) {
			   		 				System.out.println("\t" + pieces[1] + "pcs.");
			   		 			} else {
			   		 				System.out.println("\t * Não Disponivel *");
			   		 			}
			   		 			
			   		 			System.out.println("Bobó \t\tPhp 50.00");
			   		 			
			   		 			if (pieces[2] > 0) {
			   		 				System.out.println("\t" + pieces[2] + "pcs.");
			   		 			} else {
			   		 				System.out.println("\t * Não Disponivel *");
			   		 			}
			   		 			
			   		 			System.out.println("Feijão \t\tPhp 150.00");
			   		 			
			   		 			if (pieces[3] > 0) {
			   		 				System.out.println("\t" + pieces[3] + "pcs.");
			   		 			} else {
			   		 				System.out.println("\t * Não Disponivel *");
			   		 			}
			   		 			
			   		 			System.out.println("Arroz \t\tPhp 150.00");
			   		 			
			   		 			if (pieces[4] > 0) {
			   		 				System.out.println("\t" + pieces[4] + "pcs.");
			   		 			} else {
			   		 				System.out.println("\t * Não Disponivel *");
			   		 			}
			   		 			
			   		 			System.out.println ("\n    *********** SOBREMESA ***********");
			   		 			System.out.println("Pudim \t\t\tPhp 25.00");
			   		 			
			   		 			if (pieces[5] > 0) {
			   		 				System.out.println("\t" + pieces[5] + "pcs.");
			   		 			} else {
			   		 				System.out.println("\t * Não Disponivel *");
			   		 			}
			   		 			
			   		 			System.out.println("Doce de Leite \t\t\tPhp 20.00");
			   		 			
			   		 			if (pieces[6] > 0) {
			   		 				System.out.println("\t" + pieces[7] + "pcs.");
			   		 			} else {
			   		 				System.out.println("\t * Não Disponivel *");
			   		 			}
			   		 			
			   		 			System.out.println("Goiabada \t\t\tPhp 25.00");
			   		 			
			   		 			if (pieces[7] > 0) {
			   		 				System.out.println("\t" + pieces[7] + "pcs.");
			   		 			} else {
			   		 				System.out.println("\t * Não Disponivel *");
			   		 			}
			   		 			
			   		 			System.out.println("Nata de Coco \t\tPhp 20.00");
			   		 			
			   		 			if (pieces[8] > 0) {
			   		 				System.out.println("\t" + pieces[8] + "pcs.");
			   		 			} else {
			   		 				System.out.println("\t * Não Disponivel");
			   		 			}
			   		 			
			   		 			System.out.println("\n    *********** BEBIDAS ************");
			   		 			System.out.println("Coca-Cola \t\t\t\tPhp 30.00");
			   		 			
			   		 			if (pieces[9] > 0) {
			   		 				System.out.println("\t" + pieces[9] + "pcs.");
			   		 			} else {
			   		 				System.out.println("\t * Não Disponivel *");
			   		 			}
			   		 			
			   		 			System.out.println("Sprite \t\t\t\tPhp 30.00");
			   		 			
			   		 			if (pieces[10] > 0) {
			   		 				System.out.println("\t" + pieces[10] + "pcs.");
			   		 			} else {
			   		 				System.out.println("\t * Não Disponivel *");
			   		 			}
			   		 			
			   		 			System.out.println("Pepsi \t\t\t\tPhp 25.00");
			   		 			
			   		 			if (pieces[11] > 0) {
			   		 				System.out.println("\t" + pieces[11] + "pcs.");
			   		 			} else {
			   		 				System.out.println("\t * Não Disponivel *");
			   		 			}
			   		 			
			   		 			System.out.println("Guaraná \t\t\t\tPhp 25.00");
			   		 			
			   		 			if (pieces[12] > 0) {
			   		 				System.out.println("\t" + pieces[12] + "pcs.");
			   		 			} else {
			   		 				System.out.println("\t * Não Disponivel *");
			   		 			}
			   		 			
			   		 			System.out.println (" *************************************");
			   		 			
			   		 			if (pieces[1] == 0 && pieces[2] == 0 && pieces[3] == 0 && pieces[4] == 0) {
			   		 				System.out.println("\n Prato Principal Não Disponivel!");
			   		 			} else {
			   		 				for (int v = 1; v == 1;) {
			   		 					System.out.println("\nVocê deseja pedir o prato principal? [Y/N]: ");
			   		 					mainQ = in.readLine();
			   		 					
			   		 					if (mainQ.equalsIgnoreCase("y")) {
			   		 						do {
				   		 						System.out.println ("\n\t ********** PRATO PRINCIPAL **********");
						    	 				System.out.println (" **************************************");
						    	 				System.out.println (" NOME \t\t\t\t PREÇO");
						    	 				System.out.print (" 1) Camarão " + "\tPhp 50.00");
						    	 				
						    	 				if (pieces[1] > 0) {
						    	 					System.out.println("\t" + pieces[1] + "pcs.");
						    	 				} else {
						    	 					System.out.println("\t * Não Disponivel *");
						    	 				}
						    	 				
						    	 				System.out.println("2) Bobó " + "\tPhp 50.00");
						    	 				
						    	 				if (pieces[2] > 0) {
						    	 					System.out.println("\t" + pieces[2] + "pcs.");
						    	 				} else {
						    	 					System.out.println("\t * Não Disponivel *");
						    	 				}
						    	 				
						    	 				System.out.println("3) Feijão " + "\tPhp 100.00");
						    	 				
						    	 				if (pieces[3] > 0) {
						    	 					System.out.println("\t" + pieces[3] + "pcs.");
						    	 				} else {
						    	 					System.out.println("\t * Não Disponivel *");
						    	 				}
						    	 				
						    	 				System.out.println("4) Arroz " + "\tPhp 100.00");
						    	 				
						    	 				if (pieces[4] > 0) {
						    	 					System.out.println("\t" + pieces[4] + "pcs.");
						    	 				} else {
						    	 					System.out.println("\t Não Disponivel");
						    	 				}
						    	 				
						    	 				System.out.println (" **************************************");
						    	 				
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
						    	 					System.out.println("Quantos? ");
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
					   		 					System.out.println("\n\t ********** SOBREMESA **********");
							    	 			System.out.println(" **************************************");
								    	 		System.out.println(" NOME\t\t\t\tPREÇO");
								    	 		
								    	 		System.out.print("1) Pudim \t\tPhp 25.00");
								    	 		
								    	 		if (pieces[5] > 0) {
								    	 			System.out.println("\t" + pieces[5] + "pcs.");
								    	 		} else {
								    	 			System.out.println("\t * Não disponivel *");
								    	 		}
								    	 		
								    	 		System.out.println("2) Doce de Leite \t\tPhp 20.00");
								    	 		
								    	 		if (pieces[6] > 0) {
								    	 			System.out.println("\t" + pieces[6] + "pcs.");
								    	 		} else {
								    	 			System.out.println("\t * Não disponivel *");
								    	 		}
								    	 		
								    	 		System.out.println("3) Goiabada \t\tPhp 25.00");
								    	 		
								    	 		if (pieces[7] > 0) {
								    	 			System.out.println("\t" + pieces[7] + "pcs." );
								    	 		} else {
								    	 			System.out.println("\t * Não disponivel *");
								    	 		}
								    	 		
								    	 		System.out.println("4) Nata de Coco \tPhp 20.00");
								    	 		
								    	 		if (pieces[8] > 0) {
								    	 			System.out.println("\t" + pieces[8] + "pcs.");
								    	 		} else {
								    	 			System.out.println("\t * Não disponivel *");
								    	 		}
								    	 		
								    	 		System.out.println (" **************************************");
								    	 		
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
								    	 						
								    	 						System.out.println("Desculpe, só temos " + pieces[v] + "pcs, disponivel.");
								    	 						
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
					   		 					System.out.println ("\n\t ********** BEBIDAS **********");
								    	 		System.out.println (" **************************************");
								    	 		System.out.println (" NOME\t\t\t\tPREÇO");
								    	 		
								    	 		System.out.print ("1) Coca-Cola \t\t\tPhp 30.00");
								    	 		
								    	 		if (pieces[9] > 0) {
								    	 			System.out.println("\t" + pieces[9] + "pcs.");
								    	 		} else {
								    	 			System.out.println("\t * Não Disponivel *");
								    	 		}
								    	 		
								    	 		System.out.print("2) Sprite \t\t\tPhp 30.00");
								    	 		
								    	 		if (pieces[10] > 0) {
								    	 			System.out.println("\t" + pieces[10] + "pcs.");
								    	 		} else {
								    	 			System.out.println("\t * Não Disponivel*");
								    	 		}
								    	 		
								    	 		System.out.print("3) Pepsi \t\t\tPhp 25.00");
								    	 		
								    	 		if (pieces[11] > 0) {
								    	 			System.out.println("\t" + pieces[11] + "pcs.");
								    	 		} else {
								    	 			System.out.println("\t * Não Disponivel*");
								    	 		}
								    	 		
								    	 		System.out.print("4) Guaraná \t\t\tPhp 25.00");
								    	 		
								    	 		if (pieces[12] > 0) {
								    	 			System.out.println("\t" + pieces[12] + "pcs.");
								    	 		} else {
								    	 			System.out.println("\t * Não Disponivel*");
								    	 		}
								    	 		
								    	 		System.out.println (" **************************************");
								    	 		
								    	 		
								    	 		
				   		 					} while(drinksQ2.equalsIgnoreCase("y"));
				   		 				}
				   		 			}
				   		 		}
				 			
		   		 			} while (r == 1);
		   		 		}
		   		 		
		   		 	}
		   		 	
	   		 	} while (again.equalsIgnoreCase("y"));
			}
			
			
			
			
			
			
			
			//"Camarão\tPhp 50.00", "Bobó\tPhp 50.00", "Feijão\tPhp 100.00", "Arroz\tPhp 150.00",
			//"Pudim\t\tPhp 25.00", "Doce de Leite\t\tPhp 20.00", "Goiabada\t\tPhp 25.00", "Nata de Coco\tPhp 20.00",
			//"Coca-Cola\t\t\tPhp 30.00", "Sprite\t\t\tPhp 30.00", "Pepsi\t\t\tPhp 25.00", "Guaraná\t\t\tPhp 25.00"};

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
	}
}
