package planetwars;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*To-Do
	-Finish selection of planet logic and then add ship invasions and whatnot



*/
@SuppressWarnings({ "serial", "unused" })
	class Background extends JPanel{

//Should have commented this better...oh well	
	
	//main con is the main counter
	static int maincon = 0;
	
 //large planets	
	static int planetside1 = 1;
	static int planetside2 = 2;
	static int planetside3 = 0;
	static int planetside4 = 0;
		static int planetvar1 = 0;
		static int planetvar2 = 0;
		static int planetvar3 = 0;
		static int planetvar4 = 0;
	
//small planets		
		static int planetside5 = 0;
		static int planetside6 = 0;
		static int planetside7 = 0;
		static int planetside8 = 0;
	//small planet counters
		static int smallcon1 = 0;
		static int smallcon2 = 0;
		static int smallcon3 = 0;
		static int smallcon4 = 0;
		//small planet amount of ships
			static int planetvar5 = 0;
			static int planetvar6 = 0;
			static int planetvar7 = 0;
			static int planetvar8 = 0;
	
//Click detectors
	static int selectedplanet1 = 0;
	static int selectedplanet2 = 0;
	
	static boolean bigboolclick1 = false;
	static boolean bigboolclick2 = false;
	static boolean bigboolclick3 = false;
	static boolean bigboolclick4 = false;
				
	static boolean smallboolclick1 = false;
	static boolean smallboolclick2 = false;
	static boolean smallboolclick3 = false;
	static boolean smallboolclick4 = false;
	
		public static boolean bigship = false;

			
	//planet locations will be changed to variables using getWidth() and getHeight() or getLength()
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
//		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
	//			RenderingHints.VALUE_ANTIALIAS_ON);	
	
		//this part paints the actual planets
		g2d.setColor(Color.BLACK);
		g2d.fillRect(0, 0, 1400, 750);
		
		//Big planets
		if (planetside1 == 0){
			g2d.setColor(Color.GRAY);
			}
			if (planetside1 == 1){
				g2d.setColor(Color.BLUE);
			}
			if (planetside1 == 2){
				g2d.setColor(Color.RED);
			}
			g2d.fillOval(200, 200, 50, 50);	
			
		if (planetside2 == 0){
			g2d.setColor(Color.GRAY);
			}
			if (planetside2 == 1){
				g2d.setColor(Color.BLUE);
			}
			if (planetside2 == 2){
				g2d.setColor(Color.RED);
			}
			g2d.fillOval(150, 0, 50, 50);
		
		if (planetside3 == 0){
			g2d.setColor(Color.GRAY);
			}
			if (planetside3 == 1){
				g2d.setColor(Color.BLUE);
			}
			if (planetside3 == 2){
				g2d.setColor(Color.RED);
			}
			g2d.fillOval(350, 200, 50, 50);	
				
		if (planetside4 == 0){
			g2d.setColor(Color.GRAY);
			}
			if (planetside4 == 1){
			g2d.setColor(Color.BLUE);
			}
			if (planetside4 == 2){
			g2d.setColor(Color.RED);
			}
			g2d.fillOval(300, 0, 50, 50);
			
		//small planets
		if (planetside5 == 0){
			g2d.setColor(Color.GRAY);
			}
			if (planetside5 == 1){
			g2d.setColor(Color.BLUE);
			}
			if (planetside5 == 2){
			g2d.setColor(Color.RED);
			}
			g2d.fillOval(50, 50, 25, 25);
		if (planetside6 == 0){
			g2d.setColor(Color.GRAY);
			}
			if (planetside6 == 1){
				g2d.setColor(Color.BLUE);
			}
			if (planetside6 == 2){
				g2d.setColor(Color.RED);
			}
			g2d.fillOval(100, 150, 25, 25);
		if (planetside7 == 0){
			g2d.setColor(Color.GRAY);
			}
			if (planetside7 == 1){
				g2d.setColor(Color.BLUE);
			}
			if (planetside7 == 2){
				g2d.setColor(Color.RED);
			}
			g2d.fillOval(250, 50, 25, 25);
		if (planetside8 == 0){
			g2d.setColor(Color.GRAY);
			}
			if (planetside8 == 1){
				g2d.setColor(Color.BLUE);
			}
			if (planetside8 == 2){
				g2d.setColor(Color.RED);
			}
			g2d.fillOval(300, 150, 25, 25);

		//selection shine
		//big planet 1
		g2d.setColor(Color.CYAN);
		if (bigboolclick1 == true){
			g2d.drawOval(200, 200, 50, 50);
			g2d.drawOval(201, 201, 49, 49);
			g2d.drawOval(201, 201, 48, 48);
			g2d.drawOval(202, 202, 47, 47);
		}
		//big planet 2
		if (bigboolclick2 == true){
			g2d.drawOval(149, 0, 50, 50);
			g2d.drawOval(150, 1, 49, 49);
			g2d.drawOval(150, 1, 48, 48);
			g2d.drawOval(151, 2, 47, 47);	
		}
		//big planet 3
		if (bigboolclick3 == true){
			g2d.drawOval(350, 200, 50, 50);
			g2d.drawOval(351, 201, 49, 49);
			g2d.drawOval(351, 201, 48, 48);
			g2d.drawOval(352, 202, 47, 47);
		}
		//big planet 4
		if (bigboolclick4 == true){
			g2d.drawOval(300, 0, 50, 50);
			g2d.drawOval(301, 1, 49, 49);
			g2d.drawOval(301, 1, 48, 48);
			g2d.drawOval(302, 2, 47, 47);
		}
		
		//small planet 1
		if (smallboolclick1 == true){
			g2d.drawOval(50, 50, 25, 25);
			g2d.drawOval(51, 51, 24, 24);
			g2d.drawOval(51, 51, 23, 23);
			g2d.drawOval(52, 52, 22, 22);
		}
		//small planet 2
		if(smallboolclick2 == true){
			g2d.drawOval(100, 150, 25, 25);
			g2d.drawOval(101, 151, 24, 24);
			g2d.drawOval(101, 151, 23, 23);
			g2d.drawOval(102, 152, 22, 22);
		}
		//small planet 3
		if(smallboolclick3 == true){
			g2d.drawOval(250, 50, 25, 25);
			g2d.drawOval(251, 51, 24, 24);
			g2d.drawOval(251, 51, 23, 23);
			g2d.drawOval(252, 52, 22, 22);
		}
		//small planet 4
		if(smallboolclick4 == true){
			g2d.drawOval(300, 150, 25, 25);
			g2d.drawOval(301, 151, 24, 24);
			g2d.drawOval(301, 151, 23, 23);
			g2d.drawOval(302, 152, 22, 22);
		}
		

		//this next part paints the amount of ships for each planet
		g2d.setColor(Color.WHITE);
		//big planets
		g2d.drawString(""+planetvar1, 220, 232);
		g2d.drawString(""+planetvar2, 170, 32);
		g2d.drawString(""+planetvar3, 370, 232);	
		g2d.drawString(""+planetvar4, 320, 33);
		//small planets
		g2d.drawString(""+planetvar5, 60, 66);
		g2d.drawString(""+planetvar6, 110, 166);
		g2d.drawString(""+planetvar7, 260, 66);
		g2d.drawString(""+planetvar8, 310, 166);

		//paints actual ships
		if(bigship == true){
			g2d.fillOval(300, 450, 100, 10);
}
		/*				//decides selection/attacking/invasion         figure this out later I need a working model right now...
						if (selectedplanet1 > 0){
						if(selectedplanet2 > 0){
							//figure out how to connect planet selecton with ship count
							//send ships
							}
						}
		*/
		
		if (selectedplanet1 == 1){
			if (selectedplanet2 == 2){
				if (planetside1 == planetside2){
					planetvar2 = planetvar2 + (planetvar1/4);
				}
				planetvar2 = planetvar2 - (planetvar1/4);
				planetvar1 = 3 * (planetvar1/4);
				selectedplanet1 = 0;
				selectedplanet2 = 0;
				bigboolclick1 = false;
				bigboolclick2 = false;
				if (planetvar2 < 0){
					planetvar2 = -1* planetvar2;
					planetside2 = planetside1;
				}
				}
			}

		if (selectedplanet1 == 1){
			if (selectedplanet2 == 3){
				if (planetside1 == planetside3){
					planetvar3 = planetvar3 + (planetvar1/4);
				}
				planetvar3 = planetvar3 - (planetvar1/4);
				planetvar1 = 3 * (planetvar1/4);
				selectedplanet1 = 0;
				selectedplanet2 = 0;
				bigboolclick1 = false;
				bigboolclick3 = false;
				if (planetvar3 < 0){
					planetvar3 = -1* planetvar3;
					planetside3 = planetside1;
				}
				}
			}
		if (selectedplanet1 == 1){
			if (selectedplanet2 == 4){
				if (planetside1 == planetside4){
				planetvar4 = planetvar4 + (planetvar1/4);
				}
				planetvar4 = planetvar4 - (planetvar1/4);
				planetvar1 = 3 * (planetvar1/4);
				selectedplanet1 = 0;
				selectedplanet2 = 0;
				bigboolclick1 = false;
				bigboolclick4 = false;
				if (planetvar4 < 0){
					planetvar4 = -1* planetvar4;
					planetside4 = planetside1;
				}
				}
			}
		if (selectedplanet1 == 1){
			if (selectedplanet2 == 5){
				if (planetside1 == planetside5){
					planetvar5 = planetvar5 + (planetvar1/4);
						}
				planetvar5 = planetvar5 - (planetvar1/4);
				planetvar1 = 3 * (planetvar1/4);
				selectedplanet1 = 0;
				selectedplanet2 = 0;
				bigboolclick1 = false;
				smallboolclick1 = false;
				if (planetvar5 < 0){
					planetvar5 = -1* planetvar5;
					planetside5 = planetside1;
				}
				}
			}
		if (selectedplanet1 == 1){
			if (selectedplanet2 == 6){
				if (planetside1 == planetside6){
					planetvar6 = planetvar6 + (planetvar1/4);
						}
				planetvar6 = planetvar6 - (planetvar1/4);
				planetvar1 = 3 * (planetvar1/4);
				selectedplanet1 = 0;
				selectedplanet2 = 0;
				bigboolclick1 = false;
				smallboolclick2 = false;
				if (planetvar6 < 0){
					planetvar6 = -1* planetvar6;
					planetside6 = planetside1;
					
				}
				}
			}
		if (selectedplanet1 == 1){
			if (selectedplanet2 == 7){
				if (planetside1 == planetside7){
					planetvar7 = planetvar7 + (planetvar1/4);
						}
				planetvar7 = planetvar7 - (planetvar1/4);
				planetvar1 = 3 * (planetvar1/4);
				selectedplanet1 = 0;
				selectedplanet2 = 0;
				bigboolclick1 = false;
				smallboolclick3 = false;
				if (planetvar7 < 0){
					planetvar7 = -1* planetvar7;
					planetside7 = planetside1;
					
				}
				}
			}
		if (selectedplanet1 == 1){
			if (selectedplanet2 == 8){
				if (planetside1 == planetside8){
					planetvar8 = planetvar8 + (planetvar1/4);
						}
				planetvar8 = planetvar8 - (planetvar1/4);
				planetvar1 = 3 * (planetvar1/4);
				selectedplanet1 = 0;
				selectedplanet2 = 0;
				bigboolclick1 = false;
				smallboolclick4 = false;
				if (planetvar8 < 0){
					planetvar8 = -1* planetvar8;
					planetside8 = planetside1;
					
				}
				}
			}
				if (selectedplanet1 == 2){
			if (selectedplanet2 == 1){
				if (planetside2 == planetside1){
					planetvar1 = planetvar1 + (planetvar2/4);
						}
				planetvar1 = planetvar1 - (planetvar2/4);
				planetvar2 = 3 * (planetvar2/4);
				selectedplanet1 = 0;
				selectedplanet2 = 0;
				bigboolclick2 = false;
				bigboolclick1 = false;
				if (planetvar1 < 0){
					planetvar1 = -1* planetvar1;
					planetside1 = planetside2;
					
				}
				}
			}
				if (selectedplanet1 == 2){
			if (selectedplanet2 == 3){
				if (planetside2 == planetside3){
					planetvar3 = planetvar3 + (planetvar2/4);
						}
				planetvar3 = planetvar3 - (planetvar2/4);
				planetvar2 = 3 * (planetvar2/4);
				selectedplanet1 = 0;
				selectedplanet2 = 0;
				bigboolclick2 = false;
				bigboolclick3 = false;
				if (planetvar3 < 0){
					planetvar3 = -1* planetvar3;
					planetside3 = planetside2;
					
				}
				}
			}
				if (selectedplanet1 == 2){
			if (selectedplanet2 == 4){
				if (planetside2 == planetside4){
					planetvar4 = planetvar4 + (planetvar2/4);
				}
				planetvar4 = planetvar4 - (planetvar2/4);
				planetvar2 = 3 * (planetvar2/4);
				selectedplanet1 = 0;
				selectedplanet2 = 0;
				bigboolclick2 = false;
				bigboolclick4 = false;
				if (planetvar4 < 0){
					planetvar4 = -1* planetvar4;
					planetside4 = planetside2;
					
				}
				}
			}
				if (selectedplanet1 == 2){
			if (selectedplanet2 == 5){
				if (planetside2 == planetside5){
					planetvar5 = planetvar5 + (planetvar2/4);
				}
				planetvar5 = planetvar5 - (planetvar2/4);
				planetvar2 = 3 * (planetvar2/4);
				selectedplanet1 = 0;
				selectedplanet2 = 0;
				bigboolclick2 = false;
				smallboolclick1 = false;
				if (planetvar5 < 0){
					planetvar5 = -1* planetvar5;
					planetside5 = planetside2;
					}
				}
			}
				if (selectedplanet1 == 2){
			if (selectedplanet2 == 6){
				if (planetside2 == planetside6){
					planetvar6 = planetvar6 + (planetvar2/4);
					}
				planetvar6 = planetvar6 - (planetvar2/4);
				planetvar2 = 3 * (planetvar2/4);
				selectedplanet1 = 0;
				selectedplanet2 = 0;
				bigboolclick2 = false;
				smallboolclick2 = false;
				if (planetvar6 < 0){
					planetvar6 = -1* planetvar6;
					planetside6 = planetside2;
				}
				}
			}
				if (selectedplanet1 == 2){
			if (selectedplanet2 == 7){
				if (planetside2 == planetside7){
					planetvar7 = planetvar7 + (planetvar2/4);
					}
				planetvar7 = planetvar7 - (planetvar2/4);
				planetvar2 = 3 * (planetvar2/4);
				selectedplanet1 = 0;
				selectedplanet2 = 0;
				bigboolclick2 = false;
				smallboolclick3 = false;
				if (planetvar7 < 0){
					planetvar7 = -1* planetvar7;
					planetside7 = planetside2;
				}
				}
			}
				if (selectedplanet1 == 2){
			if (selectedplanet2 == 8){
				if (planetside2 == planetside8){
					planetvar8 = planetvar8 + (planetvar2/4);
					}
				planetvar8 = planetvar8 - (planetvar2/4);
				planetvar2 = 3 * (planetvar2/4);
				selectedplanet1 = 0;
				selectedplanet2 = 0;
				bigboolclick2 = false;
				smallboolclick4 = false;
				if (planetvar8 < 0){
					planetvar8 = -1* planetvar8;
					planetside8 = planetside2;
				}
				}
			}
				if (selectedplanet1 == 3){
					if (selectedplanet2 == 1){
						if (planetside3 == planetside1){
							planetvar1 = planetvar1 + (planetvar3/4);
							}
						planetvar1 = planetvar1 - (planetvar3/4);
						planetvar3 = 3 * (planetvar3/4);
						selectedplanet1 = 0;
						selectedplanet2 = 0;
						bigboolclick3 = false;
						bigboolclick1 = false;
						if (planetvar1 < 0){
							planetvar1 = -1* planetvar1;
							planetside1 = planetside3;
							
						}
						}
					}
						if (selectedplanet1 == 3){
					if (selectedplanet2 == 2){
						if (planetside3 == planetside2){
							planetvar2 = planetvar2 + (planetvar3/4);
							}
						planetvar2 = planetvar2 - (planetvar3/4);
						planetvar3 = 3 * (planetvar3/4);
						selectedplanet1 = 0;
						selectedplanet2 = 0;
						bigboolclick3 = false;
						bigboolclick2 = false;
						if (planetvar2 < 0){
							planetvar2 = -1* planetvar2;
							planetside2 = planetside3;
							
						}
						}
					}
						if (selectedplanet1 == 3){
					if (selectedplanet2 == 4){
						if (planetside3 == planetside4){
							planetvar4 = planetvar4 + (planetvar3/4);
						}
						planetvar4 = planetvar4 - (planetvar3/4);
						planetvar3 = 3 * (planetvar3/4);
						selectedplanet1 = 0;
						selectedplanet2 = 0;
						bigboolclick3 = false;
						bigboolclick4 = false;
						if (planetvar4 < 0){
							planetvar4 = -1* planetvar4;
							planetside4 = planetside3;
							
						}
						}
					}
						if (selectedplanet1 == 3){
					if (selectedplanet2 == 5){
						if (planetside3 == planetside5){
							planetvar5 = planetvar5 + (planetvar3/4);
						}
						planetvar5 = planetvar5 - (planetvar3/4);
						planetvar3 = 3 * (planetvar3/4);
						selectedplanet1 = 0;
						selectedplanet2 = 0;
						bigboolclick3 = false;
						smallboolclick1 = false;
						if (planetvar5 < 0){
							planetvar5 = -1* planetvar5;
							planetside5 = planetside3;
							}
						}
					}
						if (selectedplanet1 == 3){
					if (selectedplanet2 == 6){
						if (planetside3 == planetside6){
							planetvar6 = planetvar6 + (planetvar3/4);
							}
						planetvar6 = planetvar6 - (planetvar3/4);
						planetvar3 = 3 * (planetvar3/4);
						selectedplanet1 = 0;
						selectedplanet2 = 0;
						bigboolclick3 = false;
						smallboolclick2 = false;
						if (planetvar6 < 0){
							planetvar6 = -1* planetvar6;
							planetside6 = planetside3;
						}
						}
					}
						if (selectedplanet1 == 3){
					if (selectedplanet2 == 7){
						if (planetside3 == planetside7){
							planetvar7 = planetvar7 + (planetvar3/4);
							}
						planetvar7 = planetvar7 - (planetvar3/4);
						planetvar3 = 3 * (planetvar3/4);
						selectedplanet1 = 0;
						selectedplanet2 = 0;
						bigboolclick3 = false;
						smallboolclick3 = false;
						if (planetvar7 < 0){
							planetvar7 = -1* planetvar7;
							planetside7 = planetside3;
						}
						}
					}
						if (selectedplanet1 == 3){
					if (selectedplanet2 == 8){
						if (planetside3 == planetside8){
							planetvar8 = planetvar8 + (planetvar3/4);
							}
						planetvar8 = planetvar8 - (planetvar3/4);
						planetvar3 = 3 * (planetvar3/4);
						selectedplanet1 = 0;
						selectedplanet2 = 0;
						bigboolclick3 = false;
						smallboolclick4 = false;
						if (planetvar8 < 0){
							planetvar8 = -1* planetvar8;
							planetside8 = planetside3;
						}
						}
					}
						
								if (selectedplanet1 == 4){
							if (selectedplanet2 == 1){
								if (planetside4 == planetside1){
									planetvar1 = planetvar1 + (planetvar4/4);
									}
								planetvar1 = planetvar1 - (planetvar4/4);
								planetvar4 = 3 * (planetvar4/4);
								selectedplanet1 = 0;
								selectedplanet2 = 0;
								bigboolclick4 = false;
								bigboolclick1 = false;
								if (planetvar1 < 0){
									planetvar1 = -1* planetvar1;
									planetside1 = planetside4;
									
								}
								}
							}
								if (selectedplanet1 == 4){
							if (selectedplanet2 == 2){
								if (planetside4 == planetside2){
									planetvar2 = planetvar2 + (planetvar4/4);
									}
								planetvar2 = planetvar2 - (planetvar4/4);
								planetvar4 = 3 * (planetvar4/4);
								selectedplanet1 = 0;
								selectedplanet2 = 0;
								bigboolclick4 = false;
								bigboolclick2 = false;
								if (planetvar2 < 0){
									planetvar2 = -1* planetvar2;
									planetside2 = planetside4;
									
								}
								}
							}
								if (selectedplanet1 == 4){
							if (selectedplanet2 == 3){
								if (planetside4 == planetside3){
									planetvar3 = planetvar3 + (planetvar4/4);
								}
								planetvar3 = planetvar3 - (planetvar4/4);
								planetvar4 = 3 * (planetvar4/4);
								selectedplanet1 = 0;
								selectedplanet2 = 0;
								bigboolclick4 = false;
								bigboolclick3 = false;
								if (planetvar3 < 0){
									planetvar3 = -1* planetvar3;
									planetside3 = planetside4;
									
								}
								}
							}
								if (selectedplanet1 == 4){
							if (selectedplanet2 == 5){
								if (planetside4 == planetside5){
									planetvar5 = planetvar5 + (planetvar4/4);
								}
								planetvar5 = planetvar5 - (planetvar4/4);
								planetvar4 = 3 * (planetvar4/4);
								selectedplanet1 = 0;
								selectedplanet2 = 0;
								bigboolclick4 = false;
								smallboolclick1 = false;
								if (planetvar5 < 0){
									planetvar5 = -1* planetvar5;
									planetside5 = planetside4;
									}
								}
							}
								if (selectedplanet1 == 4){
							if (selectedplanet2 == 6){
								if (planetside4 == planetside6){
									planetvar6 = planetvar6 + (planetvar4/4);
									}
								planetvar6 = planetvar6 - (planetvar4/4);
								planetvar4 = 3 * (planetvar4/4);
								selectedplanet1 = 0;
								selectedplanet2 = 0;
								bigboolclick4 = false;
								smallboolclick2 = false;
								if (planetvar6 < 0){
									planetvar6 = -1* planetvar6;
									planetside6 = planetside4;
								}
								}
							}
								if (selectedplanet1 == 4){
							if (selectedplanet2 == 7){
								if (planetside4 == planetside7){
									planetvar7 = planetvar7 + (planetvar4/4);
									}
								planetvar7 = planetvar7 - (planetvar4/4);
								planetvar4 = 3 * (planetvar4/4);
								selectedplanet1 = 0;
								selectedplanet2 = 0;
								bigboolclick4 = false;
								smallboolclick3 = false;
								if (planetvar7 < 0){
									planetvar7 = -1* planetvar7;
									planetside7 = planetside4;
								}
								}
							}
								if (selectedplanet1 == 4){
							if (selectedplanet2 == 8){
								if (planetside4 == planetside8){
									planetvar8 = planetvar8 + (planetvar4/4);
									}
								planetvar8 = planetvar8 - (planetvar4/4);
								planetvar4 = 3 * (planetvar4/4);
								selectedplanet1 = 0;
								selectedplanet2 = 0;
								bigboolclick4 = false;
								smallboolclick4 = false;
								if (planetvar8 < 0){
									planetvar8 = -1* planetvar8;
									planetside8 = planetside4;
								}
								}
							}
								if (selectedplanet1 == 5){
									if (selectedplanet2 == 1){
										if (planetside5 == planetside1){
											planetvar1 = planetvar1 + (planetvar5/4);
											}
										planetvar1 = planetvar1 - (planetvar5/4);
										planetvar5 = 3 * (planetvar5/4);
										selectedplanet1 = 0;
										selectedplanet2 = 0;
										smallboolclick1 = false;
										bigboolclick1 = false;
										if (planetvar1 < 0){
											planetvar1 = -1* planetvar1;
											planetside1 = planetside5;
											
										}
										}
									}
										if (selectedplanet1 == 5){
									if (selectedplanet2 == 2){
										if (planetside5 == planetside2){
											planetvar2 = planetvar2 + (planetvar5/4);
											}
										planetvar2 = planetvar2 - (planetvar5/4);
										planetvar5 = 3 * (planetvar5/4);
										selectedplanet1 = 0;
										selectedplanet2 = 0;
										smallboolclick1 = false;
										bigboolclick2 = false;
										if (planetvar2 < 0){
											planetvar2 = -1* planetvar2;
											planetside2 = planetside5;
											
										}
										}
									}
										if (selectedplanet1 == 5){
									if (selectedplanet2 == 3){
										if (planetside5 == planetside3){
											planetvar3 = planetvar3 + (planetvar5/4);
										}
										planetvar3 = planetvar3 - (planetvar5/4);
										planetvar5 = 3 * (planetvar5/4);
										selectedplanet1 = 0;
										selectedplanet2 = 0;
										smallboolclick1 = false;
										bigboolclick3 = false;
										if (planetvar3 < 0){
											planetvar3 = -1* planetvar3;
											planetside3 = planetside5;
											
										}
										}
									}
										if (selectedplanet1 == 5){
									if (selectedplanet2 == 4){
										if (planetside5 == planetside4){
											planetvar4 = planetvar4 + (planetvar5/4);
										}
										planetvar4 = planetvar4 - (planetvar5/4);
										planetvar5 = 3 * (planetvar5/4);
										selectedplanet1 = 0;
										selectedplanet2 = 0;
										smallboolclick1 = false;
										bigboolclick4 = false;
										if (planetvar4 < 0){
											planetvar4 = -1* planetvar4;
											planetside4 = planetside5;
											}
										}
									}
										if (selectedplanet1 == 5){
									if (selectedplanet2 == 6){
										if (planetside5 == planetside6){
											planetvar6 = planetvar6 + (planetvar5/4);
											}
										planetvar6 = planetvar6 - (planetvar5/4);
										planetvar5 = 3 * (planetvar5/4);
										selectedplanet1 = 0;
										selectedplanet2 = 0;
										smallboolclick1 = false;
										smallboolclick2 = false;
										if (planetvar6 < 0){
											planetvar6 = -1* planetvar6;
											planetside6 = planetside5;
										}
										}
									}
										if (selectedplanet1 == 5){
									if (selectedplanet2 == 7){
										if (planetside5 == planetside7){
											planetvar7 = planetvar7 + (planetvar5/4);
											}
										planetvar7 = planetvar7 - (planetvar5/4);
										planetvar5 = 3 * (planetvar5/4);
										selectedplanet1 = 0;
										selectedplanet2 = 0;
										smallboolclick1 = false;
										smallboolclick3 = false;
										if (planetvar7 < 0){
											planetvar7 = -1* planetvar7;
											planetside7 = planetside5;
										}
										}
									}
										if (selectedplanet1 == 5){
									if (selectedplanet2 == 8){
										if (planetside5 == planetside8){
											planetvar8 = planetvar8 + (planetvar5/4);
											}
										planetvar8 = planetvar8 - (planetvar5/4);
										planetvar5 = 3 * (planetvar5/4);
										selectedplanet1 = 0;
										selectedplanet2 = 0;
										smallboolclick1 = false;
										smallboolclick4 = false;
										if (planetvar8 < 0){
											planetvar8 = -1* planetvar8;
											planetside8 = planetside5;
										}
										}
									}
										if (selectedplanet1 == 6){
											if (selectedplanet2 == 1){
												if (planetside6 == planetside1){
													planetvar1 = planetvar1 + (planetvar6/4);
													}
												planetvar1 = planetvar1 - (planetvar6/4);
												planetvar6 = 3 * (planetvar6/4);
												selectedplanet1 = 0;
												selectedplanet2 = 0;
												smallboolclick2 = false;
												bigboolclick1 = false;
												if (planetvar1 < 0){
													planetvar1 = -1* planetvar1;
													planetside1 = planetside6;
													
												}
												}
											}
												if (selectedplanet1 == 6){
											if (selectedplanet2 == 2){
												if (planetside6 == planetside2){
													planetvar2 = planetvar2 + (planetvar6/4);
													}
												planetvar2 = planetvar2 - (planetvar6/4);
												planetvar6 = 3 * (planetvar6/4);
												selectedplanet1 = 0;
												selectedplanet2 = 0;
												smallboolclick2 = false;
												bigboolclick2 = false;
												if (planetvar2 < 0){
													planetvar2 = -1* planetvar2;
													planetside2 = planetside6;
													
												}
												}
											}
												if (selectedplanet1 == 6){
											if (selectedplanet2 == 3){
												if (planetside6 == planetside3){
													planetvar3 = planetvar3 + (planetvar6/4);
												}
												planetvar3 = planetvar3 - (planetvar6/4);
												planetvar6 = 3 * (planetvar6/4);
												selectedplanet1 = 0;
												selectedplanet2 = 0;
												smallboolclick2 = false;
												bigboolclick3 = false;
												if (planetvar3 < 0){
													planetvar3 = -1* planetvar3;
													planetside3 = planetside6;
													
												}
												}
											}
												if (selectedplanet1 == 6){
											if (selectedplanet2 == 4){
												if (planetside6 == planetside4){
													planetvar4 = planetvar4 + (planetvar6/4);
												}
												planetvar4 = planetvar4 - (planetvar6/4);
												planetvar6 = 3 * (planetvar6/4);
												selectedplanet1 = 0;
												selectedplanet2 = 0;
												smallboolclick2 = false;
												bigboolclick4 = false;
												if (planetvar4 < 0){
													planetvar4 = -1* planetvar4;
													planetside4 = planetside6;
													}
												}
											}
												if (selectedplanet1 == 6){
											if (selectedplanet2 == 5){
												if (planetside6 == planetside5){
													planetvar5 = planetvar5 + (planetvar6/4);
													}
												planetvar5 = planetvar5 - (planetvar6/4);
												planetvar6 = 3 * (planetvar6/4);
												selectedplanet1 = 0;
												selectedplanet2 = 0;
												smallboolclick2 = false;
												smallboolclick1 = false;
												if (planetvar5 < 0){
													planetvar5 = -1* planetvar5;
													planetside5 = planetside6;
												}
												}
											}
												if (selectedplanet1 == 6){
											if (selectedplanet2 == 7){
												if (planetside6 == planetside7){
													planetvar7 = planetvar7 + (planetvar6/4);
													}
												planetvar7 = planetvar7 - (planetvar6/4);
												planetvar6 = 3 * (planetvar6/4);
												selectedplanet1 = 0;
												selectedplanet2 = 0;
												smallboolclick2 = false;
												smallboolclick3 = false;
												if (planetvar7 < 0){
													planetvar7 = -1* planetvar7;
													planetside7 = planetside6;
												}
												}
											}
												if (selectedplanet1 == 6){
											if (selectedplanet2 == 8){
												if (planetside6 == planetside8){
													planetvar8 = planetvar8 + (planetvar6/4);
													}
												planetvar8 = planetvar8 - (planetvar6/4);
												planetvar6 = 3 * (planetvar6/4);
												selectedplanet1 = 0;
												selectedplanet2 = 0;
												smallboolclick2 = false;
												smallboolclick4 = false;
												if (planetvar8 < 0){
													planetvar8 = -1* planetvar8;
													planetside8 = planetside6;
												}
												}
											}
												if (selectedplanet1 == 7){
													if (selectedplanet2 == 1){
														if (planetside7 == planetside1){
															planetvar1 = planetvar1 + (planetvar7/4);
															}
														planetvar1 = planetvar1 - (planetvar7/4);
														planetvar7 = 3 * (planetvar7/4);
														selectedplanet1 = 0;
														selectedplanet2 = 0;
														smallboolclick3 = false;
														bigboolclick1 = false;
														if (planetvar1 < 0){
															planetvar1 = -1* planetvar1;
															planetside1 = planetside7;
															
														}
														}
													}
														if (selectedplanet1 == 7){
													if (selectedplanet2 == 2){
														if (planetside7 == planetside2){
															planetvar2 = planetvar2 + (planetvar7/4);
															}
														planetvar2 = planetvar2 - (planetvar7/4);
														planetvar7 = 3 * (planetvar7/4);
														selectedplanet1 = 0;
														selectedplanet2 = 0;
														smallboolclick3 = false;
														bigboolclick2 = false;
														if (planetvar2 < 0){
															planetvar2 = -1* planetvar2;
															planetside2 = planetside7;
															
														}
														}
													}
														if (selectedplanet1 == 7){
													if (selectedplanet2 == 3){
														if (planetside7 == planetside3){
															planetvar3 = planetvar3 + (planetvar7/4);
														}
														planetvar3 = planetvar3 - (planetvar7/4);
														planetvar7 = 3 * (planetvar7/4);
														selectedplanet1 = 0;
														selectedplanet2 = 0;
														smallboolclick3 = false;
														bigboolclick3 = false;
														if (planetvar3 < 0){
															planetvar3 = -1* planetvar3;
															planetside3 = planetside7;
															
														}
														}
													}
														if (selectedplanet1 == 7){
													if (selectedplanet2 == 4){
														if (planetside7 == planetside4){
															planetvar4 = planetvar4 + (planetvar7/4);
														}
														planetvar4 = planetvar4 - (planetvar7/4);
														planetvar7 = 3 * (planetvar7/4);
														selectedplanet1 = 0;
														selectedplanet2 = 0;
														smallboolclick3 = false;
														bigboolclick4 = false;
														if (planetvar4 < 0){
															planetvar4 = -1* planetvar4;
															planetside4 = planetside7;
															}
														}
													}
														if (selectedplanet1 == 7){
													if (selectedplanet2 == 5){
														if (planetside7 == planetside5){
															planetvar5 = planetvar5 + (planetvar7/4);
															}
														planetvar5 = planetvar5 - (planetvar7/4);
														planetvar7 = 3 * (planetvar7/4);
														selectedplanet1 = 0;
														selectedplanet2 = 0;
														smallboolclick3 = false;
														smallboolclick1 = false;
														if (planetvar5 < 0){
															planetvar5 = -1* planetvar5;
															planetside5 = planetside7;
														}
														}
													}
														if (selectedplanet1 == 7){
													if (selectedplanet2 == 6){
														if (planetside7 == planetside6){
															planetvar6 = planetvar6 + (planetvar7/4);
															}
														planetvar6 = planetvar6 - (planetvar7/4);
														planetvar7 = 3 * (planetvar7/4);
														selectedplanet1 = 0;
														selectedplanet2 = 0;
														smallboolclick3 = false;
														smallboolclick2 = false;
														if (planetvar6 < 0){
															planetvar6 = -1* planetvar6;
															planetside6 = planetside7;
														}
														}
													}
														if (selectedplanet1 == 7){
													if (selectedplanet2 == 8){
														if (planetside7 == planetside8){
															planetvar8 = planetvar8 + (planetvar7/4);
															}
														planetvar8 = planetvar8 - (planetvar7/4);
														planetvar7 = 3 * (planetvar7/4);
														selectedplanet1 = 0;
														selectedplanet2 = 0;
														smallboolclick3 = false;
														smallboolclick4 = false;
														if (planetvar8 < 0){
															planetvar8 = -1* planetvar8;
															planetside8 = planetside7;
														}
														}
													}
														if (selectedplanet1 == 8){
															if (selectedplanet2 == 1){
																if (planetside8 == planetside1){
																	planetvar1 = planetvar1 + (planetvar8/4);
																	}
																planetvar1 = planetvar1 - (planetvar8/4);
																planetvar8 = 3 * (planetvar8/4);
																selectedplanet1 = 0;
																selectedplanet2 = 0;
																smallboolclick4 = false;
																bigboolclick1 = false;
																if (planetvar1 < 0){
																	planetvar1 = -1* planetvar1;
																	planetside1 = planetside8;
																	
																}
																}
															}
																if (selectedplanet1 == 8){
															if (selectedplanet2 == 2){
																if (planetside8 == planetside2){
																	planetvar2 = planetvar2 + (planetvar8/4);
																	}
																planetvar2 = planetvar2 - (planetvar8/4);
																planetvar8 = 3 * (planetvar8/4);
																selectedplanet1 = 0;
																selectedplanet2 = 0;
																smallboolclick4 = false;
																bigboolclick2 = false;
																if (planetvar2 < 0){
																	planetvar2 = -1* planetvar2;
																	planetside2 = planetside8;
																	
																}
																}
															}
																if (selectedplanet1 == 8){
															if (selectedplanet2 == 3){
																if (planetside8 == planetside3){
																	planetvar3 = planetvar3 + (planetvar8/4);
																}
																planetvar3 = planetvar3 - (planetvar8/4);
																planetvar8 = 3 * (planetvar8/4);
																selectedplanet1 = 0;
																selectedplanet2 = 0;
																smallboolclick4 = false;
																bigboolclick3 = false;
																if (planetvar3 < 0){
																	planetvar3 = -1* planetvar3;
																	planetside3 = planetside8;
																	
																}
																}
															}
																if (selectedplanet1 == 8){
															if (selectedplanet2 == 4){
																if (planetside8 == planetside4){
																	planetvar4 = planetvar4 + (planetvar8/4);
																}
																planetvar4 = planetvar4 - (planetvar8/4);
																planetvar8 = 3 * (planetvar8/4);
																selectedplanet1 = 0;
																selectedplanet2 = 0;
																smallboolclick4 = false;
																bigboolclick4 = false;
																if (planetvar4 < 0){
																	planetvar4 = -1* planetvar4;
																	planetside4 = planetside8;
																	}
																}
															}
																if (selectedplanet1 == 8){
															if (selectedplanet2 == 5){
																if (planetside8 == planetside5){
																	planetvar5 = planetvar5 + (planetvar8/4);
																	}
																planetvar5 = planetvar5 - (planetvar8/4);
																planetvar8 = 3 * (planetvar8/4);
																selectedplanet1 = 0;
																selectedplanet2 = 0;
																smallboolclick4 = false;
																smallboolclick1 = false;
																if (planetvar5 < 0){
																	planetvar5 = -1* planetvar5;
																	planetside5 = planetside8;
																}
																}
															}
																if (selectedplanet1 == 8){
															if (selectedplanet2 == 6){
																if (planetside8 == planetside6){
																	planetvar6 = planetvar6 + (planetvar8/4);
																	}
																planetvar6 = planetvar6 - (planetvar8/4);
																planetvar8 = 3 * (planetvar8/4);
																selectedplanet1 = 0;
																selectedplanet2 = 0;
																smallboolclick4 = false;
																smallboolclick2 = false;
																if (planetvar6 < 0){
																	planetvar6 = -1* planetvar6;
																	planetside6 = planetside8;
																}
																}
															}
																if (selectedplanet1 == 8){
																	if (selectedplanet2 == 7){
																		if (planetside8 == planetside7){
																			planetvar7 = planetvar7 + (planetvar8/4);
																			}
																		planetvar7 = planetvar7 - (planetvar8/4);
																		planetvar8 = 3 * (planetvar8/4);
																		selectedplanet1 = 0;
																		selectedplanet2 = 0;
																		smallboolclick4 = false;
																		smallboolclick3 = false;
																		if (planetvar7 < 0){
																			planetvar7 = -1* planetvar7;
																			planetside7 = planetside8;
																		}
																		}
																	}
	System.out.println(getWidth());
	System.out.println(getHeight());
	
				addMouseListener(new A2());
	}
			
			
	
	

	

	
	public static void main(String[] args) throws InterruptedException{
		JFrame frame = new JFrame("Cosmos");
		frame.setLocation(300, 150);
		Background game = new Background();
		frame.getContentPane().add(new Background());
		frame.add(new Background());
		frame.setSize(800, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		




			while(true){
				
				maincon++;
				//big planet 1
				if (planetside1 == 1){
					planetvar1++;
					planetvar1++;
				}
				if(planetside1 == 2){
					planetvar1++;
					planetvar1++;
				}
				//big planet 2
				if (planetside2 == 1){
					planetvar2++;
					planetvar2++;
				}		
				if (planetside2 == 2){
					planetvar2++;
					planetvar2++;
				}
				
				//big planet 3
				if (planetside3 == 1){
					planetvar3++;
					planetvar3++;
				}		
				if (planetside3 == 2){
					planetvar3++;
					planetvar3++;
				}
				
				//big planet 4
				if (planetside4 == 1){
					planetvar4++;
					planetvar4++;
				}		
				if (planetside4 == 2){
					planetvar4++;
					planetvar4++;
				}
				//small planet 1
				if (planetside5 == 1){
							planetvar5++;
				}
				if (planetside5 == 2){
							planetvar5++;
				}
				//small planet 2
				if (planetside6 == 1){
							planetvar6++;
							}
				if (planetside6 == 2){
							planetvar6++;
						}
				
				//small planet 3
				if (planetside7 == 1){
							planetvar7++;
							}
				
				if (planetside7 == 2){
							planetvar7++;
							}
				
				//small planet 4
				if (planetside8 == 1){
							planetvar8++;
							}
				if (planetside8 == 2){
							planetvar8++;
							}

			frame.repaint();
			Thread.sleep(500);

			
				}
	}	
	
	
 		 class A2 extends MouseAdapter{
	        public void mousePressed1(MouseEvent e){
	            int mx = e.getX();
	            int my = e.getY();
	            System.out.println("2");
	            int screen = 0;
				Component start2 = null;
				if((screen ==0) && start2.contains(mx,my)){
	                screen=1;
	                System.out.println("1");
	            }
	        }
	        @Override
			public void mouseClicked(MouseEvent e) {
	        	System.out.println("I WORK!");
	     //  System.out.println(e);
	        
	        System.out.println("x: "+e.getX());
	        System.out.println("y: "+e.getY());
	        
	        if (e.getX() < 250){
	        	if(200<e.getX()){
	        		if(e.getY() < 250){
	        			if(200<e.getY()){
	        	System.out.println("CLICK ON BLU");
	        	bigboolclick1 = true;
	        	if (selectedplanet1 == 0){
        			selectedplanet1 = 1;
        			}
        		if (selectedplanet1 > 0){
        			selectedplanet2 = 1;
        			}
	        		}
	        			}
	        				}
	        					}	
	        if (e.getX() < 200){
	        	if(150<e.getX()){
	        		if(e.getY() < 50){
	        			if(0<e.getY()){
	        	System.out.println("CLICK ON RED");
	        	bigboolclick2 = true;
	        		if (selectedplanet1 == 0){
	        			selectedplanet1 = 2;
	        			}
	        		if (selectedplanet1 > 0){
	        			selectedplanet2 = 2;
	        			}
	        		}
	        			}
	        				}
	        					}
	        if (e.getX() < 400){
	        	if(350<e.getX()){
	        		if(e.getY() < 250){
	        			if(200<e.getY()){
	        	System.out.println("CLICK ON PLAN3T");
	        	bigboolclick3 = true;
	        	if (selectedplanet1 == 0){
        			selectedplanet1 = 3;
        			}
        		if (selectedplanet1 > 0){
        			selectedplanet2 = 3;
        			}
	        		}
	        			}
	        				}
	        					}
	        if (e.getX() < 350){
	        	if(300<e.getX()){
	        		if(e.getY() < 50){
	        			if(0<e.getY()){
	        	System.out.println("CLICK ON PL4NET");
	        	bigboolclick4 = true;
	        	if (selectedplanet1 == 0){
        			selectedplanet1 = 4;
        			}
        		if (selectedplanet1 > 0){
        			selectedplanet2 = 4;
        			}
	        			}
	        			}
	        				}
	        					}
	        if (e.getX() < 100){
	        	if(50<e.getX()){
	        		if(e.getY() < 100){
	        			if(50 < e.getY()){
	        	System.out.println("CLICK ON planet1");
	        	smallboolclick1 = true;
	        	if (selectedplanet1 == 0){
        			selectedplanet1 = 5;
        			}
        		if (selectedplanet1 > 0){
        			selectedplanet2 = 5;
        			}
	        			}
	        			}
	        				}
	        					}
	        if (e.getX() < 150){
	        	if(100<e.getX()){
	        		if(e.getY() < 200){
	        			if(150 < e.getY()){
	        	System.out.println("CLICK ON planet2");
	        	smallboolclick2 = true;
	        	if (selectedplanet1 == 0){
        			selectedplanet1 = 6;
        			}
        		if (selectedplanet1 > 0){
        			selectedplanet2 = 6;
        			}
	        		}
	        			}
	        				}
	        					}
	        if (e.getX() < 300){
	        	if(250<e.getX()){
	        		if(e.getY() < 100){
	        			if(50<e.getY()){
	        	System.out.println("CLICK ON planet3");
	        	smallboolclick3 = true;
	        	if (selectedplanet1 == 0){
        			selectedplanet1 = 7;
        			}
        		if (selectedplanet1 > 0){
        			selectedplanet2 = 7;
        			}
	        			}
	        			}
	        				}
	        					}
	        if (e.getX() < 350){
	        	if(300<e.getX()){
	        		if(e.getY() < 200){
	        			if(150<e.getY()){
	        	System.out.println("CLICK ON planet4");
	        	smallboolclick4 = true;
	        	if (selectedplanet1 == 0){
        			selectedplanet1 = 8;
        			}
        		if (selectedplanet1 > 0){
        			selectedplanet2 = 8;
        			}
        		}
	        			}
	        				}
	        					}
	            
	        
	        
	        }
 		 }
 	}
		 

	
