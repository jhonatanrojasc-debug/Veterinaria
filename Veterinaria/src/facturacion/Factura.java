package facturacion;

import animales.Mascotas;

public class Factura {
        private Mascotas mascota; //
        private String servicio;
        private double precioBase;
        private final double IVA = 0.21; //

        public Factura(Mascotas mascota, String servicio, double precioBase) {
            this.mascota = mascota;
            this.servicio = servicio;
            this.precioBase = precioBase;
        }

        public double calcularTotal() {
            return precioBase + (precioBase * IVA);
        }

        public void imprimirFactura() {
            System.out.println("----- FACTURA VETERINARIA -----");
            System.out.println("Paciente: " + mascota.getNombre());
            System.out.println("Servicio: " + servicio);
            System.out.println("Precio Base: $" + precioBase);
            System.out.println("Total con IVA: $" + calcularTotal());
            System.out.println("-------------------------------");
        }
    }
