package com.cuongtt.game101;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class Vector2DTest {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(Vector2D.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @org.junit.Test
    public void add() {
        
    }

    @org.junit.Test
    public void add1() {
    }

    @org.junit.Test
    public void sub() {
    }

    @org.junit.Test
    public void sub1() {
    }

    @org.junit.Test
    public void mul() {
    }

    @org.junit.Test
    public void mul1() {
    }

    @org.junit.Test
    public void asVector2D() {
    }

    @org.junit.Test
    public void normalize() {
    }

    @org.junit.Test
    public void normalize1() {
    }
}
