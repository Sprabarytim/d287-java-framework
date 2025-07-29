package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.InhousePartRepository;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;
    private final InhousePartRepository inhousePartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository, InhousePartRepository inhousePartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
        this.inhousePartRepository = inhousePartRepository;
    }

    @Override
    public void run(String... args) throws Exception {


        if(inhousePartRepository.count() == 0) {
            //creating large battery and setting values

            InhousePart largeBattery = new InhousePart();
            largeBattery.setName("Large Battery");
            largeBattery.setInv(15);
            largeBattery.setPrice(2.50);
            largeBattery.setId(1);
            largeBattery.setMinInv(1);
            largeBattery.setMaxInv(20);

            inhousePartRepository.save(largeBattery);

            //creating small battery and setting values

            InhousePart smallBattery = new InhousePart();
            smallBattery.setName("Small Battery");
            smallBattery.setInv(15);
            smallBattery.setPrice(1.25);
            smallBattery.setId(2);
            smallBattery.setMinInv(1);
            smallBattery.setMaxInv(20);

            inhousePartRepository.save(smallBattery);

            //creating medium battery and setting values

            InhousePart mediumBattery = new InhousePart();
            mediumBattery.setName("Medium Battery");
            mediumBattery.setInv(15);
            mediumBattery.setPrice(1.75);
            mediumBattery.setId(3);
            mediumBattery.setMinInv(1);
            mediumBattery.setMaxInv(20);


            inhousePartRepository.save(mediumBattery);

            //creating small bulb and setting values

            InhousePart smallBulb = new InhousePart();
            smallBulb.setName("Small Bulb");
            smallBulb.setInv(15);
            smallBulb.setPrice(.75);
            smallBulb.setId(4);
            smallBulb.setMinInv(1);
            smallBulb.setMaxInv(20);

            inhousePartRepository.save(smallBulb);

            //creating medium bulb and setting values

            InhousePart mediumBulb = new InhousePart();
            mediumBulb.setName("Medium Bulb");
            mediumBulb.setInv(15);
            mediumBulb.setPrice(1.25);
            mediumBulb.setId(5);
            mediumBulb.setMinInv(1);
            mediumBulb.setMaxInv(20);

            inhousePartRepository.save(mediumBulb);;

            //creating large bulb and setting values

            InhousePart largeBulb = new InhousePart();
            largeBulb.setName("Large Bulb");
            largeBulb.setInv(15);
            largeBulb.setPrice(2.00);
            largeBulb.setId(6);
            largeBulb.setMinInv(1);
            largeBulb.setMaxInv(20);

            inhousePartRepository.save(largeBulb);
        };

        if(productRepository.count() == 0) {

            //creating large flashlight and setting values

            Product largeFlashlight = new Product();
            largeFlashlight.setName("Large Flashlight");
            largeFlashlight.setInv(15);
            largeFlashlight.setPrice(25.00);
            largeFlashlight.setId(7);

            productRepository.save(largeFlashlight);

            //creating medium flashlight and setting values

            Product mediumFlashlight = new Product();
            mediumFlashlight.setName("Medium Flashlight");
            mediumFlashlight.setInv(15);
            mediumFlashlight.setPrice(10.25);
            mediumFlashlight.setId(8);

            productRepository.save(mediumFlashlight);

            //creating small flashlight and setting values

            Product smallFlastlight = new Product();
            smallFlastlight.setName("Small Flastlight");
            smallFlastlight.setInv(15);
            smallFlastlight.setPrice(8.75);
            smallFlastlight.setId(9);

            productRepository.save(smallFlastlight);

            //creating flood light and setting values

            Product floodLight = new Product();
            floodLight.setName("Flood Light");
            floodLight.setInv(15);
            floodLight.setPrice(25.75);
            floodLight.setId(10);

            productRepository.save(floodLight);

            //creating magnetic light and setting values

            Product magneticLight = new Product();
            magneticLight.setName("Magnetic Light");
            magneticLight.setInv(15);
            magneticLight.setPrice(15.25);
            magneticLight.setId(11);

            productRepository.save(magneticLight);

        };


       /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        /*
        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        */

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
