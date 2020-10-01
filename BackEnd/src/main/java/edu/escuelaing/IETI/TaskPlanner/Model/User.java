package edu.escuelaing.IETI.TaskPlanner.Model;

public class User {
        String nombre;
        String correo;
        String area;

        public User() {
                this.nombre = "Andrea Rodriguez";
                this.correo = "AR@mail.com";
                this.area = "Mercadeo";
        }

        public User(String nombre, String correo, String area) {
                this.nombre = nombre;
                this.correo = correo;
                this.area = area;
        }

        public String getNombre() {
                return nombre;
        }

        public void setNombre(String nombre) {
                this.nombre = nombre;
        }

        public String getCorreo() {
                return correo;
        }

        public void setCorreo(String correo) {
                this.correo = correo;
        }

        public String getArea() {
                return area;
        }

        public void setArea(String area) {
                this.area = area;
        }
}
