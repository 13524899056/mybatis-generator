package com.jack;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MybatisGeneratorUtil {

	public static void main(String[] args) throws SQLException, IOException,
			InterruptedException, XMLParserException,
            InvalidConfigurationException {
		List<String> warnings = new ArrayList<String>();
		System.out.println("Start to genreate the DAOs");
		boolean overwrite = false;

//		final String configFilePath = "/account.xml";
		final String configFilePath = "/community.xml";
//		final String configFilePath = "/userdb.xml";
//		final String configFilePath = "/payment.xml";
//		final String configFilePath ="/generatorConfig_payment.xml";
		//final String configFilePath = "/vtrade.xml";
		//final String configFilePath = "/prc.xml";
//		final String configFilePath = "/bizmonitor-quartz.xml";
        System.out.println();
		File configFile = new File(MybatisGeneratorUtil.class.getResource(configFilePath).getFile());
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(configFile);
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		myBatisGenerator.generate(null);
		System.out.println("Generate the DAOs successufully");
	}

}