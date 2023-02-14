	public static void main(String[] args) {
		
		
		List<Cliente> clientes = new ArrayList<Cliente>();
		boolean power = true;
		while (power == true) {
			System.out.println("Bienvenido al Sistema de Capacitaciones de la Empresa ''Piquer Dans Les Yeux''");
			System.out.println();
			System.out.println("Que Desea hacer?");
			System.out.println("1 - Crear Cliente");
			System.out.println("2 - Crear Capacitacion");
			System.out.println("3 - Consultar Clientes");
			System.out.println("4 - Consultar Capacitaciones");
			System.out.println("5 - Salir");
			Scanner sc = new Scanner(System.in);
			int opciones = 5;
			try{
                opciones = Integer.parseInt(sc.nextLine());
            } catch (Exception e){
                System.out.println("OPCIÓN NO VALIDA");
            }
			Cliente cliente = null;
			switch (opciones) {
				case 1: //Crear Cliente
					cliente =crearCliente();
					if (cliente != null) {
						List<Capacitacion> capacitaciones = asignarCapacitaciones();
						cliente.setCapacitaciones(capacitaciones);
						clientes.add(cliente);
					}
				
					
					break;
				case 2: //Crear Capacitacion
					
					
					break;
				case 3: // Consultar Clientes
					
					
					break;
				case 4: // Consultar Capacitaciones
					
					
					break;
				case 5:
					System.out.println("Un gusto haberlo ayudado.... Hasta luego");
					power = false;
				default:
                    System.out.println("OPCIÓN NO VALIDA");
                    
					
			}
		
			
		}
		
		
		System.out.println("Favor, ingrese Nombre del Asistente");
		System.out.println("Favor, ingrese la edad del Asistente");
	}
	
	
	private List<Capacitaciones> asignarCapacitaciones(){
		
		boolean respuestaValida = leerRespuestaCliente();
		List<Capacitacion> capacitaciones = new ArrayList<Capacitacion>();
		while (respuestaValida) { 
			
			Capacitacion cap = crearCapacitacion();
			if (cap != null) {
				capacitaciones.add(cap);
			}
		} 
		return capacitaciones;
		
	}
	
	private boolean leerRespuestaCliente(){ 
		Scanner sc = new Scanner(System.in);
		boolean preguntar = true;
		while (preguntar) {
			System.out.println("Desea ingresar capacitaciones a este cliente? y/n");
			String respuesta = pr.nextLine();
			preguntar = !respuesta.toLowerCase().equals("y") && !respuesta.toLowerCase().equals("n");
			
		}
		
		return respuesta.toLowerCase().equals("y");
	}
	
	public static Cliente crearCliente(List<Cliente> clientes) {
		Cliente cliente = new Cliente();
		Scanner sc = new Scanner(System.in);
	        try {
	            cliente.setNombreCliente(cliente.ingresarNomCliente());
	            cliente.setComunaCliente(cliente.ingresarRutCliente());
	            cliente.setDirCliente(cliente.ingresarDirCliente());
	            cliente.setComunaCliente(cliente.ingresarComCliente());
	            cliente.setTelefonoCliente(cliente.ingresarTelefono());
	            System.out.println("ALUMNO CREADO EXITOSAMENTE");
	            return cliente;
	        } catch(Exception e){
	            System.out.println("HUBO UN ERROR. INTENTE DE NUEVO");
	            e.printStackTrace();
	            return null;
	        }
	}
	
	public static Capacitacion crearCapacitacion(List<Capacitacion> capacitacion) {
		Capacitacion capacitacion = new capacitacion();
		Scanner sc = new Scanner(System.in);
	        try {
	            capacitacion.setNomCapacitacion(ingresarNomCap());
	            capacitacion.setDiaCapacitacion(ingresarDiaCap());
	            capacitacion.setHoraCapacitacion(ingresarHoraCap());
	            capacitacion.setLugarCapacitacion(ingresarLugarCap());
	            capacitacion.setDuracionCapacitacion(ingresarDurCap());
	            capacitacion.setCantAsistCapacitacion(ingresarCantAsist());
	            capacitacion.setNombreAsistente(ingresarNomAsist());
	            capacitacion.setEdadAsistCapacitacion(ingresarEdadAsist());
	            System.out.println("ALUMNO CREADO EXITOSAMENTE");
	            return capacitacion;
	        } catch(Exception e){
	            System.out.println("HUBO UN ERROR. INTENTE DE NUEVO");
	            e.printStackTrace();
	            return null;
	        }
	}
	
	
	//ingresar Nombre
		public  String ingresarNomCliente() {
			boolean ok = false;
			String nombre = null;
			while ( ok == false) {
				System.out.print("Favor ingresar Nombre del Cliente");
				Scanner pr = new Scanner(System.in);
				nombre = pr.nextLine();
				if(nombre == null || nombre.equals("") || nombre.length()<3) {
					System.out.println("Nombre no puede estar vacio");
				} else { 
					ok = true;
				}
			}
			return nombre;
		}
		
		public  int ingresarRutCliente() {
			boolean ok = false;
			int rut = 0;
			while ( ok == false) {
				Scanner pr = new Scanner(System.in);
				boolean esDigito = false;
				String rutS = pr.nextLine();
				if(rutS.matches("[0-9]+") && rutS.length() >8){
	                esDigito = true;
	            } else {
	            	System.out.println("Rut no puede estar vacio, ingresar Rut del Cliente sin puntos ni guion");
					System.out.println("Ingresar RUT:");
	            }
				if(esDigito == true) {
					rut = Integer.parseInt(rutS);
					if(rut > 11111111 && rut > 999999999) {
						System.out.println("Rut no puede estar vacio, ingresar Rut del Cliente sin puntos ni guion");
						System.out.print("Ingresar RUT:");
					} else { 		
						ok = true;
					}
				}
				
			} 
			return rut;
		}
		
		public String ingresarDirCliente() {
			boolean ok = false;
			String nombre = null;
			while ( ok == false) {
				Scanner pr = new Scanner(System.in);
				nombre = pr.nextLine();
				if(nombre == null || nombre.equals("")) {
					System.out.println("Direccion no puede estar vacio");
					System.out.print("Ingresar direccion: ");
				} else { 
					ok = true;
				}
			}
			return nombre;
		}
		
		public static String ingresarComCliente() {
			boolean ok = false;
			String nombre = null;
			while ( ok == false) {
				Scanner pr = new Scanner(System.in);
				nombre = pr.nextLine();
				if(nombre == null || nombre.equals("")) {
					System.out.println("Comuna no puede estar vacio");
					System.out.print("Ingresar Comuna: ");
				} else { 
					ok = true;
				}
			}
			return nombre;
		}
		
		//ingresar Telefono
		public static String ingresarTelefono() throws IOException{
		       boolean ok = false;
		       String fono = null;
		       while (!ok) {
		           boolean largo = false;
		           boolean esDigito = false;
		           Scanner pr = new Scanner(System.in);
		           fono = pr.nextLine();
		           if(fono.matches("[0-9]+")){
		               esDigito = true;
		           }
		           if(fono.length() >8 && fono.length() <16){
		               largo = true;
		           }
		           ok = esDigito && largo;
		       }
		       return fono;
		}
	
	
	public static void crearCliente() {
		
		System.out.println("Favor ingresar Rut del Cliente sin puntos ni guion");
		System.out.println("Favor ingresar Direccion del Cliente");
		System.out.println("Favor ingresar Comuna");
		System.out.println("Favor ingresar Telefono de contacto del Cliente");
		
	
		
	}
	
	