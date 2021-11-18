package com.company;
    public class Point3d extends Point2d {
        // координата Z
        private double zCoord;

        //создание нового объекта Point3d с тремя значениями с плавающей точкой
        public Point3d(double x, double y, double z) {
            super(x, y);
            zCoord = z;
        }

        //создание нового объекта Point3d со значениями (0.0, 0.0, 0.0) по умолчанию
        public Point3d() {
            this(0, 0, 0);
        }

        //Возвращение координаты Z
        public double getZ() {
            return zCoord;
        }

        // Установка значения координаты Z.
        public void setZ(double val) {
            zCoord = val;
        }

        // Проверка координат точек на идентичность
        public boolean isEqual(Point3d p) {
            return(this.getX()==p.getX() && this.getY()==p.getY() && this.getZ()== p.getZ());
        }

        public double distanceTo(Point3d p) {
            double xx = Math.abs(this.getX() - p.getX());
            double yy = Math.abs(this.getY() - p.getY());
            double zz = Math.abs(this.getZ() - p.getZ());
            return (Math.sqrt(xx * xx + yy * yy + zz * zz));
        }
    }