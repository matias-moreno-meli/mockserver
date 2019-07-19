public class Site {

    public static String getSites() {
        return "[" +
                "  {" +
                "    \"id\": \"MBO\"," +
                "    \"name\": \"Bolivia\"" +
                "  }," +
                "  {" +
                "    \"id\": \"MPA\"," +
                "    \"name\": \"Panamá\"" +
                "  }," +
                "  {" +
                "    \"id\": \"MLU\"," +
                "    \"name\": \"Uruguay\"" +
                "  }," +
                "  {" +
                "    \"id\": \"MCU\"," +
                "    \"name\": \"Cuba\"" +
                "  }," +
                "  {" +
                "    \"id\": \"MCR\"," +
                "    \"name\": \"Costa Rica\"" +
                "  }," +
                "  {" +
                "    \"id\": \"MPY\"," +
                "    \"name\": \"Paraguay\"" +
                "  }," +
                "  {" +
                "    \"id\": \"MGT\"," +
                "    \"name\": \"Guatemala\"" +
                "  }," +
                "  {" +
                "    \"id\": \"MSV\"," +
                "    \"name\": \"El Salvador\"" +
                "  }," +
                "  {" +
                "    \"id\": \"MCO\"," +
                "    \"name\": \"Colombia\"" +
                "  }," +
                "  {" +
                "    \"id\": \"MLB\"," +
                "    \"name\": \"Brasil\"" +
                "  }," +
                "  {" +
                "    \"id\": \"MLV\"," +
                "    \"name\": \"Venezuela\"" +
                "  }," +
                "  {" +
                "    \"id\": \"MRD\"," +
                "    \"name\": \"Dominicana\"" +
                "  }," +
                "  {" +
                "    \"id\": \"MPT\"," +
                "    \"name\": \"Portugal\"" +
                "  }," +
                "  {" +
                "    \"id\": \"MNI\"," +
                "    \"name\": \"Nicaragua\"" +
                "  }," +
                "  {" +
                "    \"id\": \"MLA\"," +
                "    \"name\": \"Argentina\"" +
                "  }," +
                "  {" +
                "    \"id\": \"MEC\"," +
                "    \"name\": \"Ecuador\"" +
                "  }," +
                "  {" +
                "    \"id\": \"MPE\"," +
                "    \"name\": \"Perú\"" +
                "  }," +
                "  {" +
                "    \"id\": \"MLM\"," +
                "    \"name\": \"Mexico\"" +
                "  }," +
                "  {" +
                "    \"id\": \"MHN\"," +
                "    \"name\": \"Honduras\"" +
                "  }," +
                "  {" +
                "    \"id\": \"MLC\"," +
                "    \"name\": \"Chile\"" +
                "  }" +
                "]";
    }

    public static String getSite(){
        return "{" +
                "  \"id\": \"MLA\"," +
                "  \"name\": \"Argentina\"," +
                "  \"country_id\": \"AR\"," +
                "  \"sale_fees_mode\": \"not_free\"," +
                "  \"mercadopago_version\": 3," +
                "  \"default_currency_id\": \"ARS\"," +
                "  \"immediate_payment\": \"optional\"," +
                "  \"payment_method_ids\": [" +
                "    \"MLAMP\"," +
                "    \"MLAWC\"," +
                "    \"MLAAM\"," +
                "    \"MLABC\"," +
                "    \"MLACD\"," +
                "    \"MLAOT\"," +
                "    \"MLADC\"," +
                "    \"MLAMO\"," +
                "    \"MLAWT\"," +
                "    \"MLAMC\"," +
                "    \"MLAMS\"," +
                "    \"MLAVS\"," +
                "    \"MLATB\"," +
                "    \"MLAVE\"" +
                "  ]," +
                "  \"settings\": {" +
                "    \"identification_types\": [" +
                "      \"DNI\"," +
                "      \"Otro\"" +
                "    ]," +
                "    \"taxpayer_types\": [" +
                "      \"IVA Exento\"," +
                "      \"IVA Responsable Inscripto\"," +
                "      \"Monotributo\"," +
                "      \"Consumidor Final\"" +
                "    ]," +
                "    \"identification_types_rules\": [" +
                "      {" +
                "        \"identification_type\": \"DNI\"," +
                "        \"rules\": [" +
                "          {" +
                "            \"enabled_taxpayer_types\": [" +
                "              \"Consumidor Final\"" +
                "            ]," +
                "            \"begins_with\": \"\"," +
                "            \"type\": \"number\"," +
                "            \"min_length\": 8," +
                "            \"max_length\": 8" +
                "          }" +
                "        ]" +
                "      }," +
                "      {" +
                "        \"identification_type\": \"Otro\"," +
                "        \"rules\": [" +
                "          {" +
                "            \"enabled_taxpayer_types\": [" +
                "              \"IVA Exento\"," +
                "              \"IVA Responsable Inscripto\"," +
                "              \"Monotributo\"" +
                "            ]," +
                "            \"begins_with\": \"\"," +
                "            \"type\": \"number\"," +
                "            \"min_length\": 11," +
                "            \"max_length\": 11" +
                "          }" +
                "        ]" +
                "      }" +
                "    ]" +
                "  }," +
                "  \"currencies\": [" +
                "    {" +
                "      \"id\": \"USD\"," +
                "      \"symbol\": \"U$S\"" +
                "    }," +
                "    {" +
                "      \"id\": \"ARS\"," +
                "      \"symbol\": \"$\"" +
                "    }" +
                "  ]," +
                "  \"categories\": [" +
                "    {" +
                "      \"id\": \"MLA5725\"," +
                "      \"name\": \"Accesorios para Vehículos\"" +
                "    }," +
                "    {" +
                "      \"id\": \"MLA1403\"," +
                "      \"name\": \"Alimentos y Bebidas\"" +
                "    }," +
                "    {" +
                "      \"id\": \"MLA1071\"," +
                "      \"name\": \"Animales y Mascotas\"" +
                "    }," +
                "    {" +
                "      \"id\": \"MLA1367\"," +
                "      \"name\": \"Antigüedades\"" +
                "    }," +
                "    {" +
                "      \"id\": \"MLA1368\"," +
                "      \"name\": \"Arte y Artesanías\"" +
                "    }," +
                "    {" +
                "      \"id\": \"MLA1743\"," +
                "      \"name\": \"Autos, Motos y Otros\"" +
                "    }," +
                "    {" +
                "      \"id\": \"MLA1384\"," +
                "      \"name\": \"Bebés\"" +
                "    }," +
                "    {" +
                "      \"id\": \"MLA1246\"," +
                "      \"name\": \"Belleza y Cuidado Personal\"" +
                "    }," +
                "    {" +
                "      \"id\": \"MLA1039\"," +
                "      \"name\": \"Cámaras y Accesorios\"" +
                "    }," +
                "    {" +
                "      \"id\": \"MLA1051\"," +
                "      \"name\": \"Celulares y Teléfonos\"" +
                "    }," +
                "    {" +
                "      \"id\": \"MLA1798\"," +
                "      \"name\": \"Coleccionables y Hobbies\"" +
                "    }," +
                "    {" +
                "      \"id\": \"MLA1648\"," +
                "      \"name\": \"Computación\"" +
                "    }," +
                "    {" +
                "      \"id\": \"MLA1144\"," +
                "      \"name\": \"Consolas y Videojuegos\"" +
                "    }," +
                "    {" +
                "      \"id\": \"MLA1276\"," +
                "      \"name\": \"Deportes y Fitness\"" +
                "    }," +
                "    {" +
                "      \"id\": \"MLA5726\"," +
                "      \"name\": \"Electrodomésticos y Aires Ac.\"" +
                "    }," +
                "    {" +
                "      \"id\": \"MLA1000\"," +
                "      \"name\": \"Electrónica, Audio y Video\"" +
                "    }," +
                "    {" +
                "      \"id\": \"MLA2547\"," +
                "      \"name\": \"Entradas para Eventos\"" +
                "    }," +
                "    {" +
                "      \"id\": \"MLA407134\"," +
                "      \"name\": \"Herramientas y Construcción\"" +
                "    }," +
                "    {" +
                "      \"id\": \"MLA1574\"," +
                "      \"name\": \"Hogar, Muebles y Jardín\"" +
                "    }," +
                "    {" +
                "      \"id\": \"MLA1499\"," +
                "      \"name\": \"Industrias y Oficinas\"" +
                "    }," +
                "    {" +
                "      \"id\": \"MLA1459\"," +
                "      \"name\": \"Inmuebles\"" +
                "    }," +
                "    {" +
                "      \"id\": \"MLA1182\"," +
                "      \"name\": \"Instrumentos Musicales\"" +
                "    }," +
                "    {" +
                "      \"id\": \"MLA3937\"," +
                "      \"name\": \"Joyas y Relojes\"" +
                "    }," +
                "    {" +
                "      \"id\": \"MLA1132\"," +
                "      \"name\": \"Juegos y Juguetes\"" +
                "    }," +
                "    {" +
                "      \"id\": \"MLA3025\"," +
                "      \"name\": \"Libros, Revistas y Comics\"" +
                "    }," +
                "    {" +
                "      \"id\": \"MLA1168\"," +
                "      \"name\": \"Música, Películas y Series\"" +
                "    }," +
                "    {" +
                "      \"id\": \"MLA1430\"," +
                "      \"name\": \"Ropa y Accesorios\"" +
                "    }," +
                "    {" +
                "      \"id\": \"MLA409431\"," +
                "      \"name\": \"Salud y Equipamiento Médico\"" +
                "    }," +
                "    {" +
                "      \"id\": \"MLA1540\"," +
                "      \"name\": \"Servicios\"" +
                "    }," +
                "    {" +
                "      \"id\": \"MLA1953\"," +
                "      \"name\": \"Otras categorías\"" +
                "    }" +
                "  ]" +
                "}";
    }
}
