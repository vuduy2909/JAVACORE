package buoi1;
          boolean a = true&&false; a= False
          boolean b = (3 > 100) || (25%5 == 0); True||Fasle . b= true
          boolean c = a && b; c= False
          boolean d = a || !b; d=(false || false) = False
	      boolean e = a || !b && c; e= (False || False && False) = False
	      boolean f = c && d && e; f = False && False && False =False
	      boolean g = (a == true) || (b == true) || (c == false) || (d == false);
	      g = (False == true) || (True == true) || (False == false) || (False == false)
	    	False || True || True || True = True