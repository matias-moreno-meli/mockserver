public class Site {

    public String getSites() {
        return "[\n" +
                "  {\n" +
                "    \"id\": \"MBO\",\n" +
                "    \"name\": \"Bolivia\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"MPA\",\n" +
                "    \"name\": \"Panamá\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"MLU\",\n" +
                "    \"name\": \"Uruguay\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"MCU\",\n" +
                "    \"name\": \"Cuba\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"MCR\",\n" +
                "    \"name\": \"Costa Rica\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"MPY\",\n" +
                "    \"name\": \"Paraguay\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"MGT\",\n" +
                "    \"name\": \"Guatemala\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"MSV\",\n" +
                "    \"name\": \"El Salvador\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"MCO\",\n" +
                "    \"name\": \"Colombia\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"MLB\",\n" +
                "    \"name\": \"Brasil\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"MLV\",\n" +
                "    \"name\": \"Venezuela\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"MRD\",\n" +
                "    \"name\": \"Dominicana\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"MPT\",\n" +
                "    \"name\": \"Portugal\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"MNI\",\n" +
                "    \"name\": \"Nicaragua\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"MLA\",\n" +
                "    \"name\": \"Argentina\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"MEC\",\n" +
                "    \"name\": \"Ecuador\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"MPE\",\n" +
                "    \"name\": \"Perú\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"MLM\",\n" +
                "    \"name\": \"Mexico\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"MHN\",\n" +
                "    \"name\": \"Honduras\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"MLC\",\n" +
                "    \"name\": \"Chile\"\n" +
                "  }\n" +
                "]";
    }

    public String getSite(){
        return "{\n" +
                "  \"id\": \"MLA\",\n" +
                "  \"name\": \"Argentina\",\n" +
                "  \"country_id\": \"AR\",\n" +
                "  \"sale_fees_mode\": \"not_free\",\n" +
                "  \"mercadopago_version\": 3,\n" +
                "  \"default_currency_id\": \"ARS\",\n" +
                "  \"immediate_payment\": \"optional\",\n" +
                "  \"payment_method_ids\": [\n" +
                "    \"MLAMP\",\n" +
                "    \"MLAWC\",\n" +
                "    \"MLAAM\",\n" +
                "    \"MLABC\",\n" +
                "    \"MLACD\",\n" +
                "    \"MLAOT\",\n" +
                "    \"MLADC\",\n" +
                "    \"MLAMO\",\n" +
                "    \"MLAWT\",\n" +
                "    \"MLAMC\",\n" +
                "    \"MLAMS\",\n" +
                "    \"MLAVS\",\n" +
                "    \"MLATB\",\n" +
                "    \"MLAVE\"\n" +
                "  ],\n" +
                "  \"settings\": {\n" +
                "    \"identification_types\": [\n" +
                "      \"DNI\",\n" +
                "      \"Otro\"\n" +
                "    ],\n" +
                "    \"taxpayer_types\": [\n" +
                "      \"IVA Exento\",\n" +
                "      \"IVA Responsable Inscripto\",\n" +
                "      \"Monotributo\",\n" +
                "      \"Consumidor Final\"\n" +
                "    ],\n" +
                "    \"identification_types_rules\": [\n" +
                "      {\n" +
                "        \"identification_type\": \"DNI\",\n" +
                "        \"rules\": [\n" +
                "          {\n" +
                "            \"enabled_taxpayer_types\": [\n" +
                "              \"Consumidor Final\"\n" +
                "            ],\n" +
                "            \"begins_with\": \"\",\n" +
                "            \"type\": \"number\",\n" +
                "            \"min_length\": 8,\n" +
                "            \"max_length\": 8\n" +
                "          }\n" +
                "        ]\n" +
                "      },\n" +
                "      {\n" +
                "        \"identification_type\": \"Otro\",\n" +
                "        \"rules\": [\n" +
                "          {\n" +
                "            \"enabled_taxpayer_types\": [\n" +
                "              \"IVA Exento\",\n" +
                "              \"IVA Responsable Inscripto\",\n" +
                "              \"Monotributo\"\n" +
                "            ],\n" +
                "            \"begins_with\": \"\",\n" +
                "            \"type\": \"number\",\n" +
                "            \"min_length\": 11,\n" +
                "            \"max_length\": 11\n" +
                "          }\n" +
                "        ]\n" +
                "      }\n" +
                "    ]\n" +
                "  },\n" +
                "  \"currencies\": [\n" +
                "    {\n" +
                "      \"id\": \"USD\",\n" +
                "      \"symbol\": \"U$S\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"ARS\",\n" +
                "      \"symbol\": \"$\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"categories\": [\n" +
                "    {\n" +
                "      \"id\": \"MLA5725\",\n" +
                "      \"name\": \"Accesorios para Vehículos\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"MLA1403\",\n" +
                "      \"name\": \"Alimentos y Bebidas\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"MLA1071\",\n" +
                "      \"name\": \"Animales y Mascotas\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"MLA1367\",\n" +
                "      \"name\": \"Antigüedades\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"MLA1368\",\n" +
                "      \"name\": \"Arte y Artesanías\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"MLA1743\",\n" +
                "      \"name\": \"Autos, Motos y Otros\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"MLA1384\",\n" +
                "      \"name\": \"Bebés\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"MLA1246\",\n" +
                "      \"name\": \"Belleza y Cuidado Personal\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"MLA1039\",\n" +
                "      \"name\": \"Cámaras y Accesorios\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"MLA1051\",\n" +
                "      \"name\": \"Celulares y Teléfonos\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"MLA1798\",\n" +
                "      \"name\": \"Coleccionables y Hobbies\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"MLA1648\",\n" +
                "      \"name\": \"Computación\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"MLA1144\",\n" +
                "      \"name\": \"Consolas y Videojuegos\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"MLA1276\",\n" +
                "      \"name\": \"Deportes y Fitness\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"MLA5726\",\n" +
                "      \"name\": \"Electrodomésticos y Aires Ac.\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"MLA1000\",\n" +
                "      \"name\": \"Electrónica, Audio y Video\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"MLA2547\",\n" +
                "      \"name\": \"Entradas para Eventos\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"MLA407134\",\n" +
                "      \"name\": \"Herramientas y Construcción\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"MLA1574\",\n" +
                "      \"name\": \"Hogar, Muebles y Jardín\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"MLA1499\",\n" +
                "      \"name\": \"Industrias y Oficinas\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"MLA1459\",\n" +
                "      \"name\": \"Inmuebles\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"MLA1182\",\n" +
                "      \"name\": \"Instrumentos Musicales\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"MLA3937\",\n" +
                "      \"name\": \"Joyas y Relojes\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"MLA1132\",\n" +
                "      \"name\": \"Juegos y Juguetes\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"MLA3025\",\n" +
                "      \"name\": \"Libros, Revistas y Comics\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"MLA1168\",\n" +
                "      \"name\": \"Música, Películas y Series\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"MLA1430\",\n" +
                "      \"name\": \"Ropa y Accesorios\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"MLA409431\",\n" +
                "      \"name\": \"Salud y Equipamiento Médico\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"MLA1540\",\n" +
                "      \"name\": \"Servicios\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"MLA1953\",\n" +
                "      \"name\": \"Otras categorías\"\n" +
                "    }\n" +
                "  ]\n" +
                "}";
    }
}
