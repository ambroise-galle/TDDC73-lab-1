import React from 'react';
import { View, Text, StyleSheet, Image, TextInput, TouchableOpacity, KeyboardAvoidingView, Platform, ScrollView } from 'react-native';

export default function App() {
  return (
    <KeyboardAvoidingView style={styles.container} behavior={Platform.OS === 'ios' ? 'padding' : 'height'}>
      <ScrollView contentContainerStyle={styles.scrollView}>
        <View style={styles.header}>
          <Text style={styles.headerText}>React Native</Text>
        </View>

        <Image
          source={require('../../assets/images/lol_icon.png')}
          style={styles.logo}
        />
        <View style={styles.buttonContainer}>
          <View style={styles.buttonRow}>
            <TouchableOpacity style={styles.button}>
              <Text style={styles.buttonText}>BUTTON</Text>
            </TouchableOpacity>
            <TouchableOpacity style={styles.button}>
              <Text style={styles.buttonText}>BUTTON</Text>
            </TouchableOpacity>
          </View>
          <View style={styles.buttonRow}>
            <TouchableOpacity style={styles.button}>
              <Text style={styles.buttonText}>BUTTON</Text>
            </TouchableOpacity>
            <TouchableOpacity style={styles.button}>
              <Text style={styles.buttonText}>BUTTON</Text>
            </TouchableOpacity>
          </View>
        </View>

        <TextInput
          style={styles.input}
          placeholder="Email"
          placeholderTextColor="#aaa"
        /> 
      </ScrollView>
    </KeyboardAvoidingView>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#F9F3F9',
  },
  scrollView: {
    flexGrow: 1,
    alignItems: 'center',
    paddingTop: 80,
  },
  header: {
    position: 'absolute',
    top: 0,
    width: '100%',
    height: 50,
    backgroundColor: '#D8B9F8',
    flexDirection: 'row',
    paddingHorizontal: 16,
  },
  headerText: {
    fontSize: 20,
    fontWeight: 'bold',
    color: '#4B0082',
    marginTop: 20,
  },
  logo: {
    width: 100,
    height: 100,
    marginBottom: 10,
    marginTop: 10,
  },
  buttonContainer: {
    marginTop: 20,
    marginBottom: 70,
  },
  buttonRow: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    marginVertical: 10,
  },
  button: {
    backgroundColor: '#E9D8F4',
    borderRadius: 8,
    paddingVertical: 10,
    paddingHorizontal: 20,
    marginHorizontal: 10,
  },
  buttonText: {
    color: '#4B0082',
    fontWeight: 'bold',
    fontSize: 14,
  },
  input: {
    borderWidth: 1,
    borderColor: '#ccc',
    borderRadius: 8,
    padding: 10,
    marginTop: 20,
    width: '90%',
    backgroundColor: '#fff',
  },
});
