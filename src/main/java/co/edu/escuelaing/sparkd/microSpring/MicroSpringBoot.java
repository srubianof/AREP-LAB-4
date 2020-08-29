/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.escuelaing.sparkd.microSpring;

import co.edu.escuelaing.sparkd.httpserver.HttpServer;

import java.util.logging.*;

/**
 * @author dnielben
 */
public class MicroSpringBoot {
    public static void main(String[] args){
        args = new String[1];
        args[0] = "co.edu.escuelaing.sparkd.microSpring.HelloController";
        try{
            MicroSpring iocServer = new MicroSpring();
            iocServer.start(args);
            HttpServer server =  new HttpServer(iocServer);
            server.setPort(getPort());
            server.start();
        }catch(Exception ex){
            Logger.getLogger(MicroSpringBoot.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 36000; //returns default port if heroku-port isn't set (i.e. on localhost)
    }
}