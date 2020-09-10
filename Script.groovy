#!/usr/bin/env groovy



		if (args.length == 0) {
			throw new IllegalArgumentException("Parametros obligatorio:  RutaArchivoXML");
		}

		File myXML = new File(args[0]);

		if (!myXML.exists()) {

			throw new FileNotFoundException("No se encuentra el archivo: " + args[0]);
		}
		
		
		

		Scanner scan = new Scanner(myXML);
		scan.useDelimiter("\\Z");
		String stringXML = scan.next();

		stringXML = stringXML.replace("10.186.11.91:24200", "10.186.12.91:24200");
		stringXML = stringXML.replace("10.186.11.55:24200", "10.186.12.57:24200");
		stringXML = stringXML.replace("10.186.11.56:24200", "10.186.12.58:24200");
		stringXML = stringXML.replace("10.186.11.13:24100", "10.186.12.15:24100");
		stringXML = stringXML.replace("10.186.11.14:24100", "10.186.12.16:24100");
		stringXML = stringXML.replace("10.186.11.55:24200,10.186.11.56:24200", "10.186.12.57:24200,10.186.12.58:24200");
		stringXML = stringXML.replace("10.186.12.91:24200", "boinfbxsoaq:24200");

		BufferedWriter out = new BufferedWriter(new FileWriter(args[0]));
		out.write(stringXML);
		out.close();
		scan.close();
	
