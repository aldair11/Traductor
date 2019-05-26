package traductor;

public class Traductor {

    Arbin<Palabra> r;

    public Traductor() {
    }

    public void insertar(Arbin<Palabra> r, Palabra x) {
        if (r.obtener().getPalabra().compareTo(x.getPalabra()) < 0) {
            if (r.izq() != null) {
                insertar(r.izq(), x);
            } else {
                r.enlIzq(new ArbinPunt<>(x));
            }
        } else {
            if (r.der() != null) {
                insertar(r.der(), x);
            } else {
                r.enlDer(new ArbinPunt<>(x));
            }
        }
    }

    public void insertar(Palabra x) {
        if (r == null) {
            r = new ArbinPunt<>(x);
        } else {
            insertar(r, x);
        }
    }

    private void preorden(Arbin<Palabra> r) {
        if (r != null) {
            System.out.println(r.obtener() + "");
            preorden(r.izq());
            preorden(r.der());
        }

    }

    public void inorden() {
        inorden(r);
    }

    private void inorden(Arbin<Palabra> r) {
        if (r != null) {
            inorden(r.izq());
            System.out.println(r.obtener() + "");
            inorden(r.der());
        }

    }

    private void posorden(Arbin<Palabra> r) {
        if (r != null) {
            inorden(r.izq());
            inorden(r.der());
            System.out.println(r.obtener() + "");
        }

    }

    public void preorden() {
        preorden(r);
    }

    public void posorden() {
        posorden(r);
    }

    private int peso(Arbin<Palabra> r) {
        if (r == null) {
            return 0;
        } else {
            return 1 + peso(r.izq()) + peso(r.der());
        }

    }

    public int peso() {
        return peso(r);
    }

    public Arbin<Palabra> buscar(String x) {
        if (r == null) {
            return null;
        } else {
            return buscar(r, x);
        }
    }

    public Arbin<Palabra> buscar(Arbin<Palabra> r, String x) {
        if (r.obtener().getPalabra().equals(x)) {
            return r;
        } else {
            if (r.obtener().getPalabra().compareTo(x) < 0) {
                if (r.izq() == null) {
                    return null;
                } else {
                    return buscar(r.izq(), x);
                }
            } else {
                if (r.der() == null) {
                    return null;
                } else {
                    return buscar(r.der(), x);
                }
            }
        }
    }

    public void eliminar(String x) {
        if (buscar(x)!=null) {
            r = eliminar(r, x);
        }
    }

    public Arbin<Palabra> eliminar(Arbin<Palabra> r, String x) {
        if (r.obtener().getPalabra().equals(x)) {
            return borrar(r, x);
        } else {
            if (r.obtener().getPalabra().compareTo(x) < 0) {
                r.enlIzq((eliminar(r.izq(), x)));
            } else {
                r.enlDer((eliminar(r.der(), x)));
            }
        }
        return r;
    }

    public Arbin<Palabra> borrar(Arbin<Palabra> r, String x) {
        if (r.izq() == null && r.der() == null) {
            return null;
        } else {
            if (r.izq() == null) {
                return r.der();
            } else {
                if (r.der() == null) {
                    return r.izq();
                } else {
                    Arbin<Palabra> m = Mayor(r.izq());
                    r.modificar(m.obtener());
                    r.enlIzq(eliminar(r.izq(), m.obtener().getPalabra()));
                    return r;
                }
            }
        }
    }

    private Arbin<Palabra> Mayor(Arbin<Palabra> r) {
        if (r != null) {
            return Mayor(r.der());
        } else {
            return r;
        }
    }

    public Palabra buscarOBJ(Arbin<Palabra> r, String x, String idioma) {
        if ("Español".equals(idioma)) {
            if (r.obtener().getPalabra().equals(x)) {
                return r.obtener();
            } else {
                if (r.obtener().getPalabra().compareTo(x) < 0) {
                    if (r.izq() == null) {
                        return null;
                    } else {
                        return buscarOBJ(r.izq(), x, idioma);
                    }
                } else {
                    if (r.der() == null) {
                        return null;
                    } else {
                        return buscarOBJ(r.der(), x, idioma);
                    }
                }
            }
        } else {
            if ("Ingles".equals(idioma)) {
                if (r.obtener().getIngles().equals(x)) {
                    return r.obtener();
                } else {
                    if (r.obtener().getIngles().compareTo(x) < 0) {
                        if (r.izq() == null) {
                            return null;
                        } else {
                            return buscarOBJ(r.izq(), x, idioma);
                        }
                    } else {
                        if (r.der() == null) {
                            return null;
                        } else {
                            return buscarOBJ(r.der(), x, idioma);
                        }

                    }
                }

            }else{
                if ("Portugues".equals(idioma)) {
                if (r.obtener().getPortugues().equals(x)) {
                    return r.obtener();
                } else {
                    if (r.obtener().getPortugues().compareTo(x) < 0) {
                        if (r.izq() == null) {
                            return null;
                        } else {
                            return buscarOBJ(r.izq(), x, idioma);
                        }
                    } else {
                        if (r.der() == null) {
                            return null;
                        } else {
                            return buscarOBJ(r.der(), x, idioma);
                        }

                    }
                }
                }
            }
        }
        return null;
    }

    public Palabra buscarOBJ(String x, String idioma) {
        return buscarOBJ(r, x, idioma);
       
    }
}
