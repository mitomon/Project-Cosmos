package planetwars;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.xml.bind.Marshaller.Listener;

import org.omg.CORBA.PUBLIC_MEMBER;


/**
 * @author mitom_000
 *
 */



/*To-Do
	-Finish selection of planet logic and then add ship invasions and whatnot



*/
@SuppressWarnings({ "serial", "unused" })
	class BasicEightPlanetSystem extends JPanel implements MouseListener{
//Should have commented this better...oh well	
	
		int mapdecider = 1;
	
	//Map 1 : Basic 8 planet system
	
	
	//main con is the main counter
	static int maincon = 0;
	//faster counter for large planets
	static int subcon1 = 0;
	//slower counter for the smaller ones
	static int subcon2 = 0;
	
	
	
	
	
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
	
	public static int shipvarX1 = 1;
	public static int shipvarX2 = 1;
	public static int shipvarX3 = 1;
	public static int shipvarX4 = 1;
	public static int shipvarX5 = 1;
	public static int shipvarX6 = 1;
	public static int shipvarX7 = 1;
	public static int shipvarX8 = 1;
	public static int shipvarX9 = 1;
	public static int shipvarX10 = 1;
	
	public static int shipvarY1 = 1;
	public static int shipvarY2 = 1;
	public static int shipvarY3 = 1;
	public static int shipvarY4 = 1;
	public static int shipvarY5 = 1;
	public static int shipvarY6 = 1;
	public static int shipvarY7 = 1;
	public static int shipvarY8 = 1;
	public static int shipvarY9 = 1;
	public static int shipvarY10 = 1;
	
	public static int shipdecider = 0;
	static int width = 0;
	static int height = 0;
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);	
	
		

		
		//this part paints the actual planets
		g2d.setColor(Color.BLACK);
		g2d.fillRect(0, 0, getWidth(), getHeight());
	
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
			g2d.fillOval(3*(getWidth()/6)-40, 5*(getHeight()/6), 50, 50);	
			
		if (planetside2 == 0){
			g2d.setColor(Color.GRAY);
			}
			if (planetside2 == 1){
				g2d.setColor(Color.BLUE);
			}
			if (planetside2 == 2){
				g2d.setColor(Color.RED);
			}
			g2d.fillOval((3*getWidth()/6)-40, 1*(getHeight()/6)-30, 50, 50);
		
		if (planetside3 == 0){
			g2d.setColor(Color.GRAY);
			}
			if (planetside3 == 1){
				g2d.setColor(Color.BLUE);
			}
			if (planetside3 == 2){
				g2d.setColor(Color.RED);
			}
			g2d.fillOval(1*(getWidth()/6)-20, 3*(getHeight()/6), 50, 50);	
				
		if (planetside4 == 0){
			g2d.setColor(Color.GRAY);
			}
			if (planetside4 == 1){
			g2d.setColor(Color.BLUE);
			}
			if (planetside4 == 2){
			g2d.setColor(Color.RED);
			}
			g2d.fillOval(5*(getWidth()/6)-20, 3*(getHeight()/6)-00, 50, 50);

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
			g2d.fillOval(2*(getWidth()/6)-20, 4*(getHeight()/6), 25, 25);	
		if (planetside6 == 0){
			g2d.setColor(Color.GRAY);
			}
			if (planetside6 == 1){
				g2d.setColor(Color.BLUE);
			}
			if (planetside6 == 2){
				g2d.setColor(Color.RED);
			}
			g2d.fillOval(4*(getWidth()/6)-20, 4*(getHeight()/6), 25, 25);	
			
		if (planetside7 == 0){
			g2d.setColor(Color.GRAY);
			}
			if (planetside7 == 1){
				g2d.setColor(Color.BLUE);
			}
			if (planetside7 == 2){
				g2d.setColor(Color.RED);
			}
			g2d.fillOval(2*(getWidth()/6)-20, 2*(getHeight()/6), 25, 25);	
		if (planetside8 == 0){
			g2d.setColor(Color.GRAY);
			}
			if (planetside8 == 1){
				g2d.setColor(Color.BLUE);
			}
			if (planetside8 == 2){
				g2d.setColor(Color.RED);
			}
			g2d.fillOval(4*(getWidth()/6)-20, 2*(getHeight()/6), 25, 25);
		
		//	g2d.setColor(Color.YELLOW);
			//Next line is a sun(needed something in the middle)
				//g2d.fillOval(3*(getWidth()/6)-60, 2*(getHeight()/6)+40, 100, 100);	
			
			//selection shine
		//big planet 1
		g2d.setColor(Color.CYAN);
		if (bigboolclick1 == true){
			g2d.drawOval(3*(getWidth()/6)-40, 5*(getHeight()/6)+0, 50, 50);
			g2d.drawOval(3*(getWidth()/6)-39, 5*(getHeight()/6)+1, 49, 49);
			g2d.drawOval(3*(getWidth()/6)-39, 5*(getHeight()/6)+1, 48, 48);
			g2d.drawOval(3*(getWidth()/6)-38, 5*(getHeight()/6)+2, 47, 47);			
		}
		//big planet 2
		if (bigboolclick2 == true){
			g2d.drawOval((3*getWidth()/6)-41, 1*(getHeight()/6)-30, 50, 50);
			g2d.drawOval((3*getWidth()/6)-40, 1*(getHeight()/6)-29, 49, 49);
			g2d.drawOval((3*getWidth()/6)-40, 1*(getHeight()/6)-29, 49, 48);
			g2d.drawOval((3*getWidth()/6)-39, 1*(getHeight()/6)-28, 47, 47);	
		}
		//big planet 3
		if (bigboolclick3 == true){
			g2d.drawOval((1*(getWidth()/6)-20), 3*(getHeight()/6)-2, 50, 50);
			g2d.drawOval((1*(getWidth()/6)-19), 3*(getHeight()/6)-1, 49, 49);
			g2d.drawOval((1*(getWidth()/6)-19), 3*(getHeight()/6)-1, 48, 48);
			g2d.drawOval((1*(getWidth()/6)-18), 3*(getHeight()/6), 47, 47);
		}
		//big planet 4
		if (bigboolclick4 == true){
			g2d.drawOval((5*(getWidth()/6)-20), 3*(getHeight()/6)-2, 50, 50);
			g2d.drawOval((5*(getWidth()/6)-19), 3*(getHeight()/6)-1, 49, 49);
			g2d.drawOval((5*(getWidth()/6)-19), 3*(getHeight()/6)-1, 48, 48);
			g2d.drawOval((5*(getWidth()/6)-18), 3*(getHeight()/6), 47, 47);
		}
		
		//small planet 1
		if (smallboolclick1 == true){
			g2d.drawOval(2*(getWidth()/6)-20, 4*(getHeight()/6)-2, 25, 25);
			g2d.drawOval(2*(getWidth()/6)-19, 4*(getHeight()/6)-1, 24, 24);
			g2d.drawOval(2*(getWidth()/6)-19, 4*(getHeight()/6)-1, 23, 23);
			g2d.drawOval(2*(getWidth()/6)-18, 4*(getHeight()/6), 22, 22);
		}
		//small planet 2
		if(smallboolclick2 == true){
			g2d.drawOval(4*(getWidth()/6)-20, 4*(getHeight()/6)-2, 25, 25);
			g2d.drawOval(4*(getWidth()/6)-19, 4*(getHeight()/6)-1, 24, 24);
			g2d.drawOval(4*(getWidth()/6)-19, 4*(getHeight()/6)-1, 23, 23);
			g2d.drawOval(4*(getWidth()/6)-18, 4*(getHeight()/6), 22, 22);
		}
		//small planet 3
		if(smallboolclick3 == true){
			g2d.drawOval(2*(getWidth()/6)-20, 2*(getHeight()/6)-2, 25, 25);
			g2d.drawOval(2*(getWidth()/6)-19, 2*(getHeight()/6)-1, 24, 24);
			g2d.drawOval(2*(getWidth()/6)-19, 2*(getHeight()/6)-1, 23, 23);
			g2d.drawOval(2*(getWidth()/6)-18, 2*(getHeight()/6), 22, 22);
		}
		//small planet 4
		if(smallboolclick4 == true){
			g2d.drawOval(4*(getWidth()/6)-20, 2*(getHeight()/6)-2, 25, 25);
			g2d.drawOval(4*(getWidth()/6)-19, 2*(getHeight()/6)-1, 24, 24);
			g2d.drawOval(4*(getWidth()/6)-19, 2*(getHeight()/6)-1, 23, 23);
			g2d.drawOval(4*(getWidth()/6)-18, 2*(getHeight()/6), 22, 22);
		}
		

		//this next part paints the amount of ships for each planet
		g2d.setColor(Color.WHITE);
		//big planets
		g2d.drawString(""+planetvar1, 3*(getWidth()/6)-17, 5*(getHeight()/6)+30);
		g2d.drawString(""+planetvar2, 3*(getWidth()/6)-17, 1*(getHeight()/6)+00);
		g2d.drawString(""+planetvar3, 1*(getWidth()/6), 3*(getHeight()/6)+30);	
		g2d.drawString(""+planetvar4, 5*(getWidth()/6), 3*(getHeight()/6)+30);
		//small planets
		g2d.drawString(""+planetvar5, 2*(getWidth()/6)-10, 4*(getHeight()/6)+18);
		g2d.drawString(""+planetvar6, 4*(getWidth()/6)-10, 4*(getHeight()/6)+18);
		g2d.drawString(""+planetvar7, 2*(getWidth()/6)-10, 2*(getHeight()/6)+18);
		g2d.drawString(""+planetvar8, 4*(getWidth()/6)-10, 2*(getHeight()/6)+18);


		

		if (selectedplanet1 == 1){
			if (selectedplanet2 == 2){
				if (planetside1 == planetside2){
					planetvar2 = planetvar2 + (planetvar1/4);
				}
				if (!(planetside1 == planetside2))
				planetvar2 = planetvar2 - (planetvar1/4);
				planetvar1 = 3 * (planetvar1/4);
				selectedplanet1 = 0;
				selectedplanet2 = 0;
				bigboolclick1 = false;
				bigboolclick2 = false;
					//paints actual ships	
					if (shipdecider == 1){
					g2d.setColor(Color.BLUE);
						g2d.fillRect(shipvarX1, shipvarY1, 50, 10);
						g2d.fillRect(shipvarX2, shipvarY2, 50, 10);
						g2d.fillRect(shipvarX3, shipvarY3, 50, 10);
						g2d.fillRect(shipvarX4, shipvarY4, 50, 10);
						g2d.fillRect(shipvarX5, shipvarY5, 50, 10);
						g2d.fillRect(shipvarX6, shipvarY6, 50, 10);
						g2d.fillRect(shipvarX7, shipvarY7, 50, 10);
					}
					
					if (shipdecider == 2){
					g2d.setColor(Color.RED);
						g2d.fillRect(shipvarX1, shipvarY1, 50, 10);
						g2d.fillRect(shipvarX2, shipvarY2, 50, 10);
						g2d.fillRect(shipvarX3, shipvarY3, 50, 10);
						g2d.fillRect(shipvarX4, shipvarY4, 50, 10);
						g2d.fillRect(shipvarX5, shipvarY5, 50, 10);
						g2d.fillRect(shipvarX6, shipvarY6, 50, 10);
						g2d.fillRect(shipvarX7, shipvarY7, 50, 10);
					}				
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
				if (!(planetside1 == planetside3))
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
				if (!(planetside1 == planetside4))
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
				if (!(planetside1 == planetside5))
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
				if (!(planetside1 == planetside6))
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
				if (!(planetside1 == planetside7))
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
				if (!(planetside1 == planetside8))
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
				if (!(planetside2 == planetside1))
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
				if (!(planetside2 == planetside3))
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
				if (!(planetside2 == planetside4))
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
				if (!(planetside2 == planetside5))
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
				if (!(planetside2 == planetside6))
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
				if (!(planetside2 == planetside7))
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
				if (!(planetside2 == planetside8))
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
						if (!(planetside3 == planetside1))
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
						if (!(planetside3 == planetside2))
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
						if (!(planetside3 == planetside4))
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
						if (!(planetside3 == planetside5))
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
						if (!(planetside3 == planetside6))
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
						if (!(planetside3 == planetside7))
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
						if (!(planetside3 == planetside8))
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
								if (!(planetside4 == planetside1))
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
								if (!(planetside4 == planetside2))
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
								if (!(planetside4 == planetside3))
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
								if (!(planetside4 == planetside5))
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
								if (!(planetside4 == planetside6))
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
								if (!(planetside4 == planetside7))
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
								if (!(planetside4 == planetside8))
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
										if (!(planetside5 == planetside1))
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
										if (!(planetside5 == planetside2))
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
										if (!(planetside5 == planetside3))
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
										if (!(planetside5 == planetside4))
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
										if (!(planetside5 == planetside6))
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
										if (!(planetside5 == planetside7))
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
										if (!(planetside5 == planetside8))
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
												if (!(planetside6 == planetside1))
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
												if (!(planetside6 == planetside2))
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
												if (!(planetside6 == planetside3))
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
												if (!(planetside6 == planetside4))
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
												if (!(planetside6 == planetside5))
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
												if (!(planetside6 == planetside7))
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
												if (!(planetside6 == planetside8))
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
														if (!(planetside7 == planetside1))
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
														if (!(planetside7 == planetside2))
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
														if (!(planetside7 == planetside3))
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
														if (!(planetside7 == planetside4))
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
														if (!(planetside7 == planetside5))
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
														if (!(planetside7 == planetside6))
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
														if (!(planetside7 == planetside8))
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
																if (!(planetside8 == planetside1))
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
																if (!(planetside8 == planetside2))
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
																if (!(planetside8 == planetside3))
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
																if (!(planetside8 == planetside4))
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
																if (!(planetside8 == planetside5))
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
																if (!(planetside8 == planetside6))
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
																		if (!(planetside8 == planetside7))
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
		//		frame.addMouseListener(this);
	}
			
	
	public static void main(String[] args) throws InterruptedException{
		JFrame frame = new JFrame("Cosmos");
		frame.setLocation(300, 150);
		BasicEightPlanetSystem game = new BasicEightPlanetSystem();
		frame.getContentPane().add(new BasicEightPlanetSystem());
		frame.add(new BasicEightPlanetSystem());
		frame.setSize(800, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		frame.addMouseListener(game);




			while(true){
				
				maincon++;
				
				if(subcon1 == maincon - 100){
				subcon1 = subcon1+100;
				//big planet 1
				if (planetside1 == 1){
					planetvar1++;
					
				}
				if(planetside1 == 2){
					planetvar1++;
					
				}
				//big planet 2
				if (planetside2 == 1){
					planetvar2++;
					
				}		
				if (planetside2 == 2){
					planetvar2++;
				
				}
				
				//big planet 3
				if (planetside3 == 1){
					planetvar3++;
					
				}		
				if (planetside3 == 2){
					planetvar3++;
					
				}
				
				//big planet 4
				if (planetside4 == 1){
					planetvar4++;
					
				}		
				if (planetside4 == 2){
					planetvar4++;
					
				}
				}
				if(subcon2 == maincon - 200){
					subcon2 = subcon2+200;
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
					}
			frame.repaint();
			Thread.sleep(5);
		width = frame.getWidth();
		height = frame.getHeight();
				}
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Click");
		System.out.println(e.getX());
        System.out.println(width);
		
	    if (e.getX() < 3*(width/6)+10){
	    	if(3*(width/6)-40<e.getX()){
	    		if(e.getY() < (5*(height/6)+50)){
	    			if(5*(height/6)<e.getY()){
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
	    if (e.getX() < 3*(width/6)+10){
	    	if(3*(width/6)-40<e.getX()){
	    		if(e.getY() < (1*(height/6)+20)){
	    			if(1*(height/6)-30<e.getY()){
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
	    if (e.getX() < 1*(width/6)+30){
	    	if(1*(width/6)-20<e.getX()){
	    		if(e.getY() < (3*(height/6)+50)){
	    			if(3*(height/6)<e.getY()){
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
	    if (e.getX() < 5*(width/6)+30){
	    	if(5*(width/6)-20<e.getX()){
	    		if(e.getY() < (3*(height/6)+50)){
	    			if(3*(height/6)<e.getY()){
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
	    if (e.getX() < 2*(width/6)+5){
	    	if(2*(width/6)-20<e.getX()){
	    		if(e.getY() < 4*(height/6)+25){
	    			if(4*(height/6)<e.getY()){
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
	    if (e.getX() < 4*(width/6)+5){
	    	if(4*(width/6)-20<e.getX()){
	    		if(e.getY() < 4*(height/6)+25){
	    			if(4*(height/6)<e.getY()){
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
	    if (e.getX() < 2*(width/6)+5){
	    	if(2*(width/6)-20<e.getX()){
	    		if(e.getY() < 2*(height/6)+25){
	    			if(2*(height/6)<e.getY()){
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
	    if (e.getX() < 4*(width/6)+5){
	    	if(4*(width/6)-20<e.getX()){
	    		if(e.getY() < 2*(height/6)+25){
	    			if(2*(height/6)<e.getY()){
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
	
	


	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Enter");
	
		
	
	    }
	

	@Override
	public void mouseExited(MouseEvent arg0) {
		System.out.println("Exit");		
	}


	@Override
	public void mousePressed(MouseEvent arg0) {
		System.out.println("Press");
		
		
	}


	@Override
	public void mouseReleased(MouseEvent arg0) {
		System.out.println("Release");
		
	}

}


		 