package com.mangotree.selfservicekiosk

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mangotree.selfservicekiosk.databinding.ActivityOrderListViewBinding

class OrderListViewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOrderListViewBinding

    companion object {
        var totalAmount: Double = 0.0
        var orderList = mutableListOf<String>()
    }

    var sisilogName = "Sisiglog"
    var steamedFriedRiceName = "Steamed Fried Rice"
    var porkchopName = "Porkchop"
    var chickenFilletName = "Chicken Fillet"
    var porkKatsudonName = "Pork Katsudon"
    var siomaiName = "Siomai Rice"
    var crispyChickenName = "Crispy Chicken"
    var longsilogName = "Longsilog"
    var tocinoWithEggName = "Tocino With Egg"
    var tunasilogName = "Tunasilog"
    var cornsilogName = "Cornsilog"
    var tapsilogName = "Tapsilog"
    var hamsilogName = "Hamsilog"
    var miloRegularName = "Milo Regular"
    var miloLargeName = "Milo Large"
    var blueLemonadeSmallName = "Blue Lemonade Small"
    var gulamanMediumName = "Gulaman Medium"
    var blueLemonadeMediumName = "Blue Lemonade Medium"
    var coffeeJellyMediumName = "Blue Lemonade Large"
    var mangoTapiocaSmallName = "Mango Tapioca Small"
    var mangoTapiocaMediumName = "Mango Tapioca Medium"
    var natureSpringSmallName = "Nature Spring Small"
    var natureSpringMediumName = "Nature Spring Medium"
    var nescafeRegularName = "Nescafe Regular"
    var icedTeaName = "Iced Tea"
    var vitamilkOriginalName = "Vitamilk Original"
    var vitamilkChocolateName = "Vitamilk Chocolate"
    var vitamilkStrawberryName= "Vitamilk Strawberry"
    var luncheonMeatName = "Luncheon Meat"
    var nuggetsName = "Nuggets"
    var kwekKwekName = "Kwek-Kwek"
    var friesSmallName = "Regular Fries"
    var friesMediumName = "Large Fries"
    var friesLargeName = "Jumbo Fries"
    var longganisaName = "Longganisa"

    ////////////////////////////////////////////////////////////////////////////////////////////////

    //RICE MEALS COUNT
    var sisilogCount = 0
    var steamedFriedRiceCount = 0
    var porkchopCount = 0
    var chickenFilletCount = 0
    var porkKatsudonCount = 0
    var siomaiRiceCount = 0
    var crispyChickenCount = 0
    var longsilogCount = 0
    var tocinoWithEggCount = 0
    var tunasilogCount = 0
    var cornsilogCount = 0
    var tapsilogCount = 0
    var hamsilogCount = 0

    //DRINKS COUNT
    var miloRegularCount = 0
    var miloLargeCount = 0
    var blueLemonadeSmallCount = 0
    var gulamanMediumCount = 0
    var blueLemonadeMediumCount = 0
    var blueLemonadeLargeCount = 0
    var mangoTapiocaSmallCount = 0
    var mangoTapiocaMediumCount = 0
    var natureSpringSmallCount = 0
    var natureSpringMediumCount = 0
    var nescafeRegularCount = 0
    var icedTeaCount = 0
    var vitamilkOriginalCount = 0
    var vitamilkChocolateCount = 0
    var vitamilkStrawberryCount = 0

    //SNACKS COUNT
    var luncheonMeatCount = 0
    var nuggetsCount = 0
    var kwekKwekCount= 0
    var friesSmallCount = 0
    var friesMediumCount = 0
    var friesLargeCount = 0
    var longganisaCount = 0

    ///////////////////////////////////////////////////////////////////////////////////////////////

    //RICE MEALS PRICES
    val sisilogPrice = 65
    val steamedFriedRicePrice = 55
    val porkchopPrice = 65
    val chickenFilletPrice = 60
    val porkKatsudonPrice = 60
    val siomaiRicePrice = 45
    val crispyChickenPrice = 60
    val longsilogPrice = 65
    val tocinoWithEggPrice = 65
    val tunasilogPrice = 65
    val cornsilogPrice = 65
    val tapsilogPrice = 65
    val hamsilogPrice = 65

    //DRINKS PRICES
    val miloRegularPrice = 30
    val miloLargePrice = 40
    val blueLemonadeSmallPrice = 20
    val gulamanMediumPrice = 35
    val blueLemonadeMediumPrice = 25
    val blueLemonadeLargePrice = 30
    val mangoTapiocaSmallPrice = 25
    val mangoTapiocaMediumPrice = 35
    val natureSpringSmallPrice = 20
    val natureSpringMediumPrice = 30
    val nescafeRegularPrice = 30
    val icedTeaPrice = 25
    val vitamilkOriginalPrice = 35
    val vitamilkChocolatePrice = 35
    val vitamilkStrawberryPrice = 40

    //SNACKS PRICES
    val luncheonMeatPrice = 20
    val nuggetsPrice = 10
    val kwekKwekPrice = 25
    val friesSmallPrice = 40
    val friesMediumPrice = 60
    val friesLargePrice = 75
    val longganisaPrice = 15

    /////////////////////////////////////////////////////////////////////////////////////////////

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOrderListViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //PLUS
        binding.sisilogPlusButton.setOnClickListener {
            sisilogCount++
            binding.sisilogCountTextView.text = "$sisilogCount"

            addDisplayTotalAmount(sisilogPrice.toDouble())
        }

        binding.steamedRicePlusButton.setOnClickListener {
            steamedFriedRiceCount++
            binding.steamedRiceCountTextView.text = "$steamedFriedRiceCount"

            addDisplayTotalAmount(steamedFriedRicePrice.toDouble())
        }

        binding.porkchopPlusButton.setOnClickListener {
            porkchopCount++
            binding.porkchopCountTextView.text = "$porkchopCount"

            addDisplayTotalAmount(porkchopPrice.toDouble())
        }

        binding.chickenFilletPlusButton.setOnClickListener {
            chickenFilletCount++
            binding.burgerstakeCountTextView.text = "$chickenFilletCount"

            addDisplayTotalAmount(chickenFilletPrice.toDouble())
        }

        binding.siomaiRicePlusButton.setOnClickListener {
            siomaiRiceCount++
            binding.siomaiRiceCountTextView.text = "$siomaiRiceCount"

            addDisplayTotalAmount(siomaiRicePrice.toDouble())
        }

        binding.porkKatsudonPlusButton.setOnClickListener {
            porkKatsudonCount++
            binding.porkKatsudonCountTextView.text = "$porkKatsudonCount"

            addDisplayTotalAmount(porkKatsudonPrice.toDouble())
        }

        binding.crispyChickenPlusButton.setOnClickListener {
            crispyChickenCount++
            binding.crispyChickenCountTextView.text = "$crispyChickenCount"

            addDisplayTotalAmount(crispyChickenPrice.toDouble())
        }

        binding.longsilogPlusButton.setOnClickListener {
            longsilogCount++
            binding.longsilogCountTextView.text = "$longsilogCount"

            addDisplayTotalAmount(longsilogPrice.toDouble())
        }

        binding.tocinoWithEggPlusButton.setOnClickListener {
            tocinoWithEggCount++
            binding.tocinoWithEggCountTextView.text = "$tocinoWithEggCount"

            addDisplayTotalAmount(tocinoWithEggPrice.toDouble())
        }

        binding.tunasilogPlusButton.setOnClickListener {
            tunasilogCount++
            binding.tunasilogCountTextView.text = "$tunasilogCount"

            addDisplayTotalAmount(tunasilogPrice.toDouble())
        }

        binding.cornsilogPlusButton.setOnClickListener {
            cornsilogCount++
            binding.cornsilogCountTextView.text = "$cornsilogCount"

            addDisplayTotalAmount(cornsilogPrice.toDouble())
        }

        binding.tapsilogPlusButton.setOnClickListener {
            tapsilogCount++
            binding.tapsilogCountTextView.text = "$tapsilogCount"

            addDisplayTotalAmount(tapsilogPrice.toDouble())
        }

        binding.hamsilogPlusButton.setOnClickListener {
            hamsilogCount++
            binding.hamsilogCountTextView.text = "$hamsilogCount"

            addDisplayTotalAmount(hamsilogPrice.toDouble())
        }

        //DRINKS

        binding.miloRegularPlusButton.setOnClickListener {
            miloRegularCount++
            binding.miloRegularCountTextView.text = "$miloRegularCount"

            addDisplayTotalAmount(miloRegularPrice.toDouble())
        }

        binding.miloLargePlusButton.setOnClickListener {
            miloLargeCount++
            binding.miloLargeCountTextView.text = "$miloLargeCount"

            addDisplayTotalAmount(miloLargePrice.toDouble())
        }

        binding.blueLemonadeSmallPlusButton.setOnClickListener {
            blueLemonadeSmallCount++
            binding.blueLemonadeSmallCountTextView.text = "$blueLemonadeSmallCount"

            addDisplayTotalAmount(blueLemonadeSmallCount.toDouble())
        }

        binding.gulamanMediumPlusButton.setOnClickListener {
            gulamanMediumCount++
            binding.gulamanMediumCountTextView.text = "$gulamanMediumCount"

            addDisplayTotalAmount(gulamanMediumPrice.toDouble())
        }

        binding.blueLemonadeMediumPlusButton.setOnClickListener {
            blueLemonadeMediumCount++
            binding.blueLemonadeMediumCountTextView.text = "$blueLemonadeMediumCount"

            addDisplayTotalAmount(blueLemonadeMediumPrice.toDouble())
        }

        binding.blueLemonadeLargePlusButton.setOnClickListener {
            blueLemonadeLargeCount++
            binding.blueLemonadeLargeCountTextView.text = "$blueLemonadeLargeCount"

            addDisplayTotalAmount(blueLemonadeLargePrice.toDouble())
        }

        binding.mangoTapiocaSmallPlusButton.setOnClickListener {
            mangoTapiocaSmallCount++
            binding.mangoTapiocaSmallCountTextView.text = "$mangoTapiocaSmallCount"

            addDisplayTotalAmount(mangoTapiocaSmallPrice.toDouble())
        }

        binding.mangoTapiocaMediumPlusButton.setOnClickListener {
            mangoTapiocaMediumCount++
            binding.mangoTapiocaMediumCountTextView.text = "$mangoTapiocaMediumCount"

            addDisplayTotalAmount(mangoTapiocaMediumPrice.toDouble())
        }

        binding.natureSprintSmallPlusButton.setOnClickListener {
            natureSpringSmallCount++
            binding.natureSprintSmallCountTextView.text = "$natureSpringSmallCount"

            addDisplayTotalAmount(natureSpringSmallPrice.toDouble())
        }

        binding.natureSprintMediumPlusButton.setOnClickListener {
            natureSpringMediumCount++
            binding.natureSprintMediumCountTextView.text = "$natureSpringMediumCount"

            addDisplayTotalAmount(natureSpringMediumPrice.toDouble())
        }

        binding.nescafeRegularPlusButton.setOnClickListener {
            nescafeRegularCount++
            binding.nescafeRegularCountTextView.text = "$nescafeRegularCount"

            addDisplayTotalAmount(nescafeRegularPrice.toDouble())
        }

        binding.icedTeaSmallPlusButton.setOnClickListener {
            icedTeaCount++
            binding.icedTeaSmallCountTextView.text = "$icedTeaCount"

            addDisplayTotalAmount(icedTeaPrice.toDouble())
        }

        binding.vitamilkOriginalPlusButton.setOnClickListener {
            vitamilkOriginalCount++
            binding.vitamilkOriginalCountTextView.text = "$vitamilkOriginalCount"

            addDisplayTotalAmount(vitamilkOriginalPrice.toDouble())
        }

        binding.vitamilkChocolatePlusButton.setOnClickListener {
            vitamilkChocolateCount++
            binding.vitamilkChocolateCountTextView.text = "$vitamilkChocolateCount"

            addDisplayTotalAmount(vitamilkChocolatePrice.toDouble())
        }

        binding.vitamilkStrawberryPlusButton.setOnClickListener {
            vitamilkStrawberryCount++
            binding.vitamilkStrawberryCountTextView.text = "$vitamilkStrawberryCount"

            addDisplayTotalAmount(vitamilkStrawberryPrice.toDouble())
        }

        //SNACKS

        binding.luncheonMeatPlusButton.setOnClickListener {
            luncheonMeatCount++
            binding.luncheonMeatCountTextView.text = "$luncheonMeatCount"

            addDisplayTotalAmount(luncheonMeatPrice.toDouble())
        }

        binding.nuggetsPlusButton.setOnClickListener {
            nuggetsCount++
            binding.nuggetsCountTextView.text = "$nuggetsCount"

            addDisplayTotalAmount(nuggetsPrice.toDouble())
        }

        binding.kwekKwekPlusButton.setOnClickListener {
            kwekKwekCount++
            binding.kwekKwekCountTextView.text = "$kwekKwekCount"

            addDisplayTotalAmount(kwekKwekPrice.toDouble())
        }

        binding.friesSmallPlusButton.setOnClickListener {
            friesSmallCount++
            binding.friesSmallCountTextView.text = "$friesSmallCount"

            addDisplayTotalAmount(friesSmallPrice.toDouble())
        }

        binding.friesMediumPlusButton.setOnClickListener {
            friesMediumCount++
            binding.friesMediumCountTextView.text = "$friesMediumCount"

            addDisplayTotalAmount(friesMediumPrice.toDouble())
        }

        binding.friesLargePlusButton.setOnClickListener {
            friesLargeCount++
            binding.friesLargeCountTextView.text = "$friesLargeCount"

            addDisplayTotalAmount(friesLargePrice.toDouble())
        }

        binding.longganisaPlusButton.setOnClickListener {
            longganisaCount++
            binding.longganisaCountTextView.text = "$longganisaCount"

            addDisplayTotalAmount(longganisaPrice.toDouble())
        }

        //MINUS
        binding.sisilogMinusButton.setOnClickListener {
            if(sisilogCount == 0) return@setOnClickListener
            sisilogCount--
            binding.sisilogCountTextView.text = "$sisilogCount"

            minusDisplayTotalAmount(sisilogPrice.toDouble())
        }

        binding.steamedRiceMinusButton.setOnClickListener {
            if(steamedFriedRiceCount == 0) return@setOnClickListener
            steamedFriedRiceCount--
            binding.steamedRiceCountTextView.text = "$steamedFriedRiceCount"

            minusDisplayTotalAmount(steamedFriedRicePrice.toDouble())
        }

        binding.porkchopMinusButton.setOnClickListener {
            if(porkchopCount == 0) return@setOnClickListener
            porkchopCount--
            binding.porkchopCountTextView.text = "$porkchopCount"

            minusDisplayTotalAmount(porkchopPrice.toDouble())
        }

        binding.chickenFilletMinusButton.setOnClickListener {
            if(chickenFilletCount == 0) return@setOnClickListener
            chickenFilletCount--
            binding.burgerstakeCountTextView.text = "$chickenFilletCount"

            minusDisplayTotalAmount(chickenFilletCount.toDouble())
        }

        binding.siomaiRiceMinusButton.setOnClickListener {
            if(siomaiRiceCount == 0) return@setOnClickListener
            siomaiRiceCount--
            binding.siomaiRiceCountTextView.text = "$siomaiRiceCount"

            minusDisplayTotalAmount(siomaiRicePrice.toDouble())
        }

        binding.porkKatsudonMinusButton.setOnClickListener {
            if(porkKatsudonCount == 0) return@setOnClickListener
            porkKatsudonCount--
            binding.porkKatsudonCountTextView.text = "$porkKatsudonCount"

            minusDisplayTotalAmount(porkKatsudonPrice.toDouble())
        }

        binding.crispyChickenMinusButton.setOnClickListener {
            if(crispyChickenCount == 0) return@setOnClickListener
            crispyChickenCount--
            binding.crispyChickenCountTextView.text = "$crispyChickenCount"

            minusDisplayTotalAmount(crispyChickenPrice.toDouble())
        }

        binding.longsilogMinusButton.setOnClickListener {
            if(longsilogCount == 0) return@setOnClickListener
            longsilogCount--
            binding.longsilogCountTextView.text = "$longsilogCount"

            minusDisplayTotalAmount(longsilogPrice.toDouble())
        }

        binding.tocinoWithEggMinusButton.setOnClickListener {
            if(tocinoWithEggCount == 0) return@setOnClickListener
            tocinoWithEggCount--
            binding.tocinoWithEggCountTextView.text = "$tocinoWithEggCount"

            minusDisplayTotalAmount(tocinoWithEggPrice.toDouble())
        }

        binding.tunasilogMinusButton.setOnClickListener {
            if(tunasilogCount == 0) return@setOnClickListener
            tunasilogCount--
            binding.tunasilogCountTextView.text = "$tunasilogCount"

            minusDisplayTotalAmount(tunasilogPrice.toDouble())
        }

        binding.cornsilogMinusButton.setOnClickListener {
            if(cornsilogCount == 0) return@setOnClickListener
            cornsilogCount--
            binding.cornsilogCountTextView.text = "$cornsilogCount"

            minusDisplayTotalAmount(cornsilogPrice.toDouble())
        }

        binding.tapsilogMinusButton.setOnClickListener {
            if(tapsilogCount == 0) return@setOnClickListener
            tapsilogCount--
            binding.tapsilogCountTextView.text = "$tapsilogCount"

            minusDisplayTotalAmount(tapsilogPrice.toDouble())
        }

        binding.hamsilogMinusButton.setOnClickListener {
            if(hamsilogCount == 0) return@setOnClickListener
            hamsilogCount--
            binding.hamsilogCountTextView.text = "$hamsilogCount"

            minusDisplayTotalAmount(hamsilogPrice.toDouble())
        }

        //DRINKS

        binding.miloRegularMinusButton.setOnClickListener {
            if(miloRegularCount == 0) return@setOnClickListener
            miloRegularCount--
            binding.miloRegularCountTextView.text = "$miloRegularCount"

            minusDisplayTotalAmount(miloRegularPrice.toDouble())
        }

        binding.miloLargeMinusButton.setOnClickListener {
            if(miloLargeCount == 0) return@setOnClickListener
            miloLargeCount--
            binding.miloLargeCountTextView.text = "$miloLargeCount"

            minusDisplayTotalAmount(miloLargePrice.toDouble())
        }

        binding.blueLemonadeSmallMinusButton.setOnClickListener {
            if(blueLemonadeSmallCount == 0) return@setOnClickListener
            blueLemonadeSmallCount--
            binding.blueLemonadeSmallCountTextView.text = "$blueLemonadeSmallCount"

            minusDisplayTotalAmount(blueLemonadeSmallPrice.toDouble())
        }

        binding.gulamanMediumMinusButton.setOnClickListener {
            if(gulamanMediumCount == 0) return@setOnClickListener
            gulamanMediumCount--
            binding.gulamanMediumCountTextView.text = "$gulamanMediumCount"

            minusDisplayTotalAmount(gulamanMediumPrice.toDouble())
        }

        binding.blueLemonadeMediumMinusButton.setOnClickListener {
            if(blueLemonadeMediumCount == 0) return@setOnClickListener
            blueLemonadeMediumCount--
            binding.blueLemonadeMediumCountTextView.text = "$blueLemonadeMediumCount"

            minusDisplayTotalAmount(blueLemonadeMediumPrice.toDouble())
        }

        binding.blueLemonadeLargeMinusButton.setOnClickListener {
            if(blueLemonadeLargeCount == 0) return@setOnClickListener
            blueLemonadeLargeCount--
            binding.blueLemonadeLargeCountTextView.text = "$blueLemonadeLargeCount"

            minusDisplayTotalAmount(blueLemonadeLargePrice.toDouble())
        }

        binding.mangoTapiocaSmallMinusButton.setOnClickListener {
            if(mangoTapiocaSmallCount == 0) return@setOnClickListener
            mangoTapiocaSmallCount--
            binding.mangoTapiocaSmallCountTextView.text = "$mangoTapiocaSmallCount"

            minusDisplayTotalAmount(mangoTapiocaSmallPrice.toDouble())
        }

        binding.mangoTapiocaMediumMinusButton.setOnClickListener {
            if(mangoTapiocaMediumCount == 0) return@setOnClickListener
            mangoTapiocaMediumCount--
            binding.mangoTapiocaMediumCountTextView.text = "$mangoTapiocaMediumCount"

            minusDisplayTotalAmount(mangoTapiocaMediumPrice.toDouble())
        }

        binding.natureSprintSmallMinusButton.setOnClickListener {
            if(natureSpringSmallCount == 0) return@setOnClickListener
            natureSpringSmallCount--
            binding.natureSprintSmallCountTextView.text = "$natureSpringSmallCount"

            minusDisplayTotalAmount(natureSpringSmallPrice.toDouble())
        }

        binding.natureSprintMediumMinusButton.setOnClickListener {
            if(natureSpringMediumCount == 0) return@setOnClickListener
            natureSpringMediumCount--
            binding.natureSprintMediumCountTextView.text = "$natureSpringMediumCount"

            minusDisplayTotalAmount(natureSpringMediumPrice.toDouble())
        }

        binding.nescafeRegularMinusButton.setOnClickListener {
            if(nescafeRegularCount == 0) return@setOnClickListener
            nescafeRegularCount--
            binding.nescafeRegularCountTextView.text = "$nescafeRegularCount"

            minusDisplayTotalAmount(nescafeRegularPrice.toDouble())
        }

        binding.icedTeaSmallMinusButton.setOnClickListener {
            if(icedTeaCount == 0) return@setOnClickListener
            icedTeaCount--
            binding.icedTeaSmallCountTextView.text = "$icedTeaCount"

            minusDisplayTotalAmount(icedTeaPrice.toDouble())
        }

        binding.vitamilkOriginalMinusButton.setOnClickListener {
            if(vitamilkOriginalCount == 0) return@setOnClickListener
            vitamilkOriginalCount--
            binding.vitamilkOriginalCountTextView.text = "$vitamilkOriginalCount"

            minusDisplayTotalAmount(vitamilkOriginalPrice.toDouble())
        }

        binding.vitamilkChocolateMinusButton.setOnClickListener {
            if(vitamilkChocolateCount == 0) return@setOnClickListener
            vitamilkChocolateCount--
            binding.vitamilkChocolateCountTextView.text = "$vitamilkChocolateCount"

            minusDisplayTotalAmount(vitamilkChocolatePrice.toDouble())
        }

        binding.vitamilkStrawberryMinusButton.setOnClickListener {
            if(vitamilkStrawberryCount == 0) return@setOnClickListener
            vitamilkStrawberryCount--
            binding.vitamilkStrawberryCountTextView.text = "$vitamilkStrawberryCount"

            minusDisplayTotalAmount(vitamilkStrawberryPrice.toDouble())
        }

        //SNACKS

        binding.luncheonMeatMinusButton.setOnClickListener {
            if(luncheonMeatCount == 0) return@setOnClickListener
            luncheonMeatCount--
            binding.luncheonMeatCountTextView.text = "$luncheonMeatCount"

            minusDisplayTotalAmount(luncheonMeatPrice.toDouble())
        }

        binding.nuggetsMinusButton.setOnClickListener {
            if(nuggetsCount == 0) return@setOnClickListener
            nuggetsCount--
            binding.nuggetsCountTextView.text = "$nuggetsCount"

            minusDisplayTotalAmount(nuggetsPrice.toDouble())
        }

        binding.kwekKwekMinusButton.setOnClickListener {
            if(kwekKwekCount == 0) return@setOnClickListener
            kwekKwekCount--
            binding.kwekKwekCountTextView.text = "$kwekKwekCount"

            minusDisplayTotalAmount(kwekKwekPrice.toDouble())
        }

        binding.friesSmallMinusButton.setOnClickListener {
            if(friesSmallCount == 0) return@setOnClickListener
            friesSmallCount--
            binding.friesSmallCountTextView.text = "$friesSmallCount"

            minusDisplayTotalAmount(friesSmallPrice.toDouble())
        }

        binding.friesMediumMinusButton.setOnClickListener {
            if(friesMediumCount == 0) return@setOnClickListener
            friesMediumCount--
            binding.friesMediumCountTextView.text = "$friesMediumCount"

            minusDisplayTotalAmount(friesMediumPrice.toDouble())
        }

        binding.friesLargeMinusButton.setOnClickListener {
            if(friesLargeCount == 0) return@setOnClickListener
            friesLargeCount--
            binding.friesLargeCountTextView.text = "$friesLargeCount"

            minusDisplayTotalAmount(friesLargePrice.toDouble())
        }

        binding.longganisaMinusButton.setOnClickListener {
            if(longganisaCount == 0) return@setOnClickListener
            longganisaCount--
            binding.longganisaCountTextView.text = "$longganisaCount"

            minusDisplayTotalAmount(longganisaPrice.toDouble())
        }

        binding.cancelImageButton.setOnClickListener {
            finish()
        }

        binding.checkoutImageButton.setOnClickListener {
            val itemCountArray = mutableListOf<Int>()
            val itemNameArray = mutableListOf<String>()
//ricemeal
            itemCountArray.add(sisilogCount)
            itemCountArray.add(steamedFriedRiceCount)
            itemCountArray.add(porkchopCount)
            itemCountArray.add(chickenFilletCount)
            itemCountArray.add(porkKatsudonCount)
            itemCountArray.add(siomaiRiceCount)
            itemCountArray.add(crispyChickenCount)
            itemCountArray.add(longsilogCount)
            itemCountArray.add(tocinoWithEggCount)
            itemCountArray.add(tunasilogCount)
            itemCountArray.add(cornsilogCount)
            itemCountArray.add(tapsilogCount)
            itemCountArray.add(hamsilogCount)
//drinks
            itemCountArray.add(miloRegularCount)
            itemCountArray.add(miloLargeCount)
            itemCountArray.add(blueLemonadeSmallCount)
            itemCountArray.add(gulamanMediumCount)
            itemCountArray.add(blueLemonadeMediumCount)
            itemCountArray.add(blueLemonadeLargeCount)
            itemCountArray.add(mangoTapiocaSmallCount)
            itemCountArray.add(mangoTapiocaMediumCount)
            itemCountArray.add(natureSpringSmallCount)
            itemCountArray.add(natureSpringMediumCount)
            itemCountArray.add(nescafeRegularCount)
            itemCountArray.add(icedTeaCount)
            itemCountArray.add(vitamilkOriginalCount)
            itemCountArray.add(vitamilkChocolateCount)
            itemCountArray.add(vitamilkStrawberryCount)
//snacks
            itemCountArray.add(luncheonMeatCount)
            itemCountArray.add(nuggetsCount)
            itemCountArray.add(kwekKwekCount)
            itemCountArray.add(friesSmallCount)
            itemCountArray.add(friesMediumCount)
            itemCountArray.add(friesLargeCount)
            itemCountArray.add(longganisaCount)

            itemNameArray.add(sisilogName)
            itemNameArray.add(steamedFriedRiceName)
            itemNameArray.add(porkchopName)
            itemNameArray.add(chickenFilletName)
            itemNameArray.add(porkKatsudonName)
            itemNameArray.add(siomaiName)
            itemNameArray.add(crispyChickenName)
            itemNameArray.add(longsilogName)
            itemNameArray.add(tocinoWithEggName)
            itemNameArray.add(tunasilogName)
            itemNameArray.add(cornsilogName)
            itemNameArray.add(tapsilogName)
            itemNameArray.add(hamsilogName)

            itemNameArray.add(miloRegularName)
            itemNameArray.add(miloLargeName)
            itemNameArray.add(blueLemonadeSmallName)
            itemNameArray.add(gulamanMediumName)
            itemNameArray.add(blueLemonadeMediumName)
            itemNameArray.add(coffeeJellyMediumName)
            itemNameArray.add(mangoTapiocaSmallName)
            itemNameArray.add(mangoTapiocaMediumName)
            itemNameArray.add(natureSpringSmallName)
            itemNameArray.add(natureSpringMediumName)
            itemNameArray.add(nescafeRegularName)
            itemNameArray.add(icedTeaName)
            itemNameArray.add(vitamilkOriginalName)
            itemNameArray.add(vitamilkChocolateName)
            itemNameArray.add(vitamilkStrawberryName)

            itemNameArray.add(luncheonMeatName)
            itemNameArray.add(nuggetsName)
            itemNameArray.add(kwekKwekName)
            itemNameArray.add(friesSmallName)
            itemNameArray.add(friesMediumName)
            itemNameArray.add(friesLargeName)
            itemNameArray.add(longganisaName)

            processOrders(itemCountArray, itemNameArray)
            startActivity(Intent(this@OrderListViewActivity, CheckoutActivity::class.java))
            finish()
        }

    }

    @SuppressLint("SetTextI18n")
    fun addDisplayTotalAmount(value: Double) {
        totalAmount += value
        binding.totalAmountTextView.text = "TOTAL AMOUNT: $totalAmount php"
    }

    @SuppressLint("SetTextI18n")
    fun minusDisplayTotalAmount(value: Double) {
        totalAmount -= value
        binding.totalAmountTextView.text = "TOTAL AMOUNT: $totalAmount php"
    }

    private fun processOrders(counts: List<Int>, names: List<String>){
        for (index in counts.indices) {
            if (counts[index] != 0) {
                orderList.add("${names[index]}: ${counts[index]}")
            }
        }
    }

}